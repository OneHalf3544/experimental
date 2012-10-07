package ru.onehalf.testprogram.creator;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.onehalf.testprogram.data.dao.TestQuestionDao;
import ru.onehalf.testprogram.data.dataobjects.TestQuestion;
import ru.onehalf.testprogram.data.dataobjects.Variant;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p/>
 * <p/>
 * Created: 19.04.12 16:02
 * <p/>
 *
 * @author OneHalf
 */
@Controller
@RequestMapping(value = "/create/question")
public class QuestionCreatorController {

    private static final Logger logger = Logger.getLogger(QuestionCreatorController.class);

    @Autowired
    private TestQuestionDao testQuestionDao;

    @RequestMapping(method = RequestMethod.GET)
    public String getCreateTestPage(Map<String,Object> map) {
        map.put("createdQuestion", new CreatedQuestion());
        return "testCreate/createTest";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitCreateTest(
            @Valid CreatedQuestion createdQuestion,
            BindingResult result) {

        if (!result.hasErrors()) {
            logger.info("doesn't has error");

            TestQuestion question = createQuestionEntry(createdQuestion);
            testQuestionDao.insert(question);

            return "testCreate/createTest";
        }

        logger.error("has error: result: " + result.getAllErrors());
        return "testCreate/createTest";
    }

    private TestQuestion createQuestionEntry(CreatedQuestion createdQuestion) {
        TestQuestion testQuestion = new TestQuestion();

        List<Variant> variants = collectVariants(createdQuestion);
        for (Variant variant : variants) {
            variant.setQuestion(testQuestion);
        }

        testQuestion.setQuestion(createdQuestion.getQuestion());
        testQuestion.setVariants(variants);
        testQuestion.setRightAnswer(variants.get(createdQuestion.getRightVariant()));

        testQuestion.setTestSetNo(createdQuestion.getTestSetNo());
        testQuestion.setTestNumber(createdQuestion.getTestNumber());

        return testQuestion;
    }

    private List<Variant> collectVariants(CreatedQuestion createdQuestion) {
        List<Variant> result = new ArrayList<Variant>();

        for (String variant : new String[]{
                createdQuestion.getVariant0(),
                createdQuestion.getVariant1(),
                createdQuestion.getVariant2(),
                createdQuestion.getVariant3(),
                createdQuestion.getVariant4()}) {

            if (variant == null) {
                return result;
            }
            result.add(new Variant(null, variant));
        }

        return result;
    }
}