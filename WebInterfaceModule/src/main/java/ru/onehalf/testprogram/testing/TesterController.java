package ru.onehalf.testprogram.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.onehalf.testprogram.data.dao.TestQuestionDao;

import javax.validation.Valid;
import java.util.Map;

/**
 * <p/>
 * <p/>
 * Created: 10.04.12 10:27
 * <p/>
 *
 * @author OneHalf
 */
@Controller
public class TesterController {

    @Autowired
    private TestQuestionDao testDataDao;

    @RequestMapping("/")
    public String tester() {
        return "index";
    }

    @RequestMapping("/testing/{testSet}/{testNumber}")
    public String testerPage(@Valid ValidateTestIdentifier validator,
                             Map<String,Object> model,
                             @ModelAttribute("testSet") @PathVariable("testSet") Integer testSet,
                             @ModelAttribute("testNumber") @PathVariable("testNumber") Integer testNumber) {

        model.put("question", testDataDao.getQuestion(testSet, testNumber));
        
        return "testingPage";
    }
}
