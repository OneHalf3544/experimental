package ru.onehalf.testprogram.data.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.onehalf.testprogram.data.dataobjects.TestSet;

import java.util.List;

/**
 * <p/>
 * <p/>
 * Created: 15.04.12 21:28
 * <p/>
 *
 * @author OneHalf
 */
@Service
public class TestSetDaoImpl implements TestSetDao {

    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    @Transactional
    public TestSet loadTestSetById(Long id) {
        return hibernateTemplate.get(TestSet.class, id);
    }

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
    public List<TestSet> loadTestSetList() {
        return hibernateTemplate.find("from TestSet order by name");
    }
}
