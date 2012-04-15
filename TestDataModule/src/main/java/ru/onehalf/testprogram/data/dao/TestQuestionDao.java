package ru.onehalf.testprogram.data.dao;

import ru.onehalf.testprogram.data.dataobjects.TestQuestion;

import java.util.List;

/**
 * <p/>
 * <p/>
 * Created: 13.04.12 11:29
 * <p/>
 *
 * @author OneHalf
 */
public interface TestQuestionDao {

    public TestQuestion getQuestion(Integer testSet, Integer testNumber);

    public List<TestQuestion> getTestSet(Integer testSetNo);
}
