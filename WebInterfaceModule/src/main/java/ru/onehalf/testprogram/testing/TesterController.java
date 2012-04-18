package ru.onehalf.testprogram.testing;

import org.apache.maven.Maven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.onehalf.testprogram.data.dao.TestQuestionDao;
import ru.onehalf.testprogram.data.dao.TestSetDao;

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

    private Maven maven;

    @Autowired
    private TestQuestionDao testDataDao;

    @Autowired
    private TestSetDao testSetDao;

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
        
        return "testing/testingPage";
    }

    @RequestMapping(value = "/testAnswer", method = RequestMethod.POST)
    public String testAnswerPage(@ModelAttribute("answer") @Valid QuestionAnswer questionAnswer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "errorAnswer";
        }
        return "testing/testAnswer";
    }

    @RequestMapping(value = "/testSetSelect", params = "!testSetNumber")
    public String testSetSelect(Map<String,Object> map) {
        map.put("testSetContent", testSetDao.loadTestSetList());

        return "testing/testSetSelect";
    }

    @RequestMapping(value = "/testSetSelect", params = "testSetNumber")
    public String testSetSelect(
            @ModelAttribute("testSetNumber")
            @RequestParam("testSetNumber")
            Long testSetId) {

        return "forward:/spring/testing/"+testSetId+"/0";
    }
}
