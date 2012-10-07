package ru.onehalf.testprogram.data.dao;

import ru.onehalf.testprogram.data.dataobjects.TestQuestion;

import java.util.List;

/**
 * Dao object for persist questions in the database
 * <p/>
 * Created: 13.04.12 11:29
 * <p/>
 *
 * @author OneHalf
 */
public interface TestQuestionDao {

    /**
     * Get question object by test set id and a index number of question in the set
     * @param testSet id of test set
     * @param testNumber index number of question in the current test set
     * @return
     */
    public TestQuestion getQuestion(Integer testSet, Integer testNumber);

    /**
     * Get question list for specified test set
     * @param testSetNo test set id
     * @return list of questions
     */
    public List<TestQuestion> getTestSet(Integer testSetNo);

    /**
     * Add new question to the database
     * @param question added question
     */
    public void insert(TestQuestion question);
}
