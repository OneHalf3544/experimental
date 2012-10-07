package ru.onehalf.testprogram.data.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import ru.onehalf.testprogram.data.dataobjects.TestQuestion;

import java.util.List;

/**
 * Implementing of dao interface to access questions in the database
 * <p/>
 * Created: 13.04.12 11:31
 * <p/>
 *
 * @author OneHalf
 */
@Service
public class TestQuestionDaoImpl implements TestQuestionDao {

    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    @Transactional
    public TestQuestion getQuestion(Integer testSet, Integer testNumber) {
        List list = hibernateTemplate.find(
                "from TestQuestion where testSetNo = ? and testNumber = ?", testSet, testNumber);
        return CollectionUtils.isEmpty(list) ? null : (TestQuestion) list.get(0);
    }

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
    public List<TestQuestion> getTestSet(Integer testSetNo) {
        return hibernateTemplate.find("from TestQuestion where testSetNo = ? order by testNumber", testSetNo);
    }

    @Override
    @Transactional
    public void insert(TestQuestion question) {
        hibernateTemplate.save(question);
    }
}
