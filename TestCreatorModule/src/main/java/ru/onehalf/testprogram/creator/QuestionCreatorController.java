package ru.onehalf.testprogram.creator;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
public class QuestionCreatorController {

    @RequestMapping(value = "/create/question", method = RequestMethod.GET)
    public String getCreateTestPage(Map<String,Object> map) {
        map.put("question", new Question);
        return "testCreate/createTest";
    }

    @RequestMapping(value = "/create/question", method = RequestMethod.POST)
    public String submitCreateTest() {
        return "testCreate/createTest";
    }
}
