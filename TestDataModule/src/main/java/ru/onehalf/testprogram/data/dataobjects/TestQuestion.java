package ru.onehalf.testprogram.data.dataobjects;

import javax.persistence.*;
import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TEST_SET_ID")
    private Integer testSetNo;

    @Column(name = "TEST_NUMBER")
    private Integer testNumber;

    @Column(name = "QUESTION", length = 255)
    private String question;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "question", cascade = CascadeType.ALL)
    private List<Variant> variants;

    /**
     * Правильный вариант
     */
    @Column(name = "RIGHT_VARIANT_ID")
    private Integer rightAnswer;

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

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer  rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
