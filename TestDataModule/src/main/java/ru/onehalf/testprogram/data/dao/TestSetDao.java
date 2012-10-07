package ru.onehalf.testprogram.data.dao;

import ru.onehalf.testprogram.data.dataobjects.TestSet;

import java.util.List;

/**
 * A DAO for getting info about question set
 * <p/>
 * Created: 15.04.12 19:30
 * <p/>
 *
 * @author OneHalf
 */
public interface TestSetDao {

    /**
     * Load test set object by id
     * @param id identity of test set
     * @return test set data
     */
    public TestSet loadTestSetById(Long id);

    /**
     * Get all test sets
     * @return
     */
    public List<TestSet> loadTestSetList();

    /**
     * Add or update data
     * @param testSet
     */
    public void saveOrUpdate(TestSet testSet);
}
