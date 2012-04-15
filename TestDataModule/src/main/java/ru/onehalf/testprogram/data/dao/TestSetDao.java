package ru.onehalf.testprogram.data.dao;

import ru.onehalf.testprogram.data.dataobjects.TestSet;

import java.util.List;

/**
 * DAO для получения информации по набору вопросов
 * <p/>
 * Created: 15.04.12 19:30
 * <p/>
 *
 * @author OneHalf
 */
public interface TestSetDao {

    public TestSet loadTestSetById(Long id);

    public List<TestSet> loadTestSetList();
}
