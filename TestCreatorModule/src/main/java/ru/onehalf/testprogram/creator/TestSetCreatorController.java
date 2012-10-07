package ru.onehalf.testprogram.creator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.onehalf.testprogram.data.dao.TestSetDao;
import ru.onehalf.testprogram.data.dataobjects.TestSet;

import javax.validation.Valid;

/**
 * <p/>
 * <p/>
 * Created: 20.04.12 11:25
 * <p/>
 *
 * @author OneHalf
 */
@Controller
public class TestSetCreatorController {

    @Autowired
    private TestSetDao testSetDao;
    
    private static final Logger logger = Logger.getLogger(TestSetCreatorController.class);

    @RequestMapping(value = "/create/testset", params = "!testSet", method = RequestMethod.GET)
    public String getCreatingPage(CreatedTestSet createdTestSet) {
        return "testCreate/createTestSet";
    }

    @RequestMapping(value = "/create/testset", params = "testSet", method = RequestMethod.GET)
    public String getEditPage(Long testSet) {
        CreatedTestSet createdTestSet = new CreatedTestSet();
        TestSet editedTestSet = testSetDao.loadTestSetById(testSet);

        createdTestSet.setTestSetId(testSet);
        createdTestSet.setName(editedTestSet.getName());
        createdTestSet.setDescription(editedTestSet.getDescription());

        return "testCreate/createTestSet";
    }

    @RequestMapping(value = "/create/testset", method = RequestMethod.POST)
    public String submitPage(@Valid CreatedTestSet createdTestSet, BindingResult result) {
        TestSet testSet = new TestSet();
        testSet.setName(createdTestSet.getName());
        testSet.setDescription(createdTestSet.getDescription());

        testSetDao.saveOrUpdate(testSet);

        return "testCreate/createTestSet";
    }
}
