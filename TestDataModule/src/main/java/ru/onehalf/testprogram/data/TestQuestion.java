package ru.onehalf.testprogram.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p/>
 * <p/>
 * Created: 13.04.12 11:33
 * <p/>
 *
 * @author OneHalf
 */
@Entity
@Table(name = "TEST_QUESTION")
public class TestQuestion {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TEST_SET")
    private Integer testSetNo;

    @Column(name = "TEST_NUMBER")
    private Integer testNumber;

    @Column(name = "QUESTION", length = 255)
    private String question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestSetNo() {
        return testSetNo;
    }

    public void setTestSetNo(Integer testSetNo) {
        this.testSetNo = testSetNo;
    }

    public Integer getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Integer testNumber) {
        this.testNumber = testNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
