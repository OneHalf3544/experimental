package ru.onehalf.testprogram.creator;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * <p/>
 * <p/>
 * Created: 19.04.12 18:11
 * <p/>
 *
 * @author OneHalf
 */
public class CreatedQuestion {

    @NotEmpty(message = "fill the question text")
    private String question;

    @Size(min = 1, message = "at least two variants must be present")
    private String variant0;

    @Size(min = 1, message = "at least two variants must be present")
    private String variant1;

    private String variant2;

    private String variant3;

    private String variant4;

    @Min(0)
    @Max(4)
    private Integer rightVariant;

    private Integer testSetNo = 2;

    private Integer testNumber = 2;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getRightVariant() {
        return rightVariant;
    }

    public void setRightVariant(Integer rightVariant) {
        this.rightVariant = rightVariant;
    }

    public String getVariant1() {
        return variant1;
    }

    public void setVariant1(String variant1) {
        this.variant1 = variant1;
    }

    public String getVariant2() {
        return variant2;
    }

    public void setVariant2(String variant2) {
        this.variant2 = variant2;
    }

    public String getVariant3() {
        return variant3;
    }

    public void setVariant3(String variant3) {
        this.variant3 = variant3;
    }

    public String getVariant4() {
        return variant4;
    }

    public void setVariant4(String variant4) {
        this.variant4 = variant4;
    }

    public String getVariant0() {
        return variant0;
    }

    public void setVariant0(String variant0) {
        this.variant0 = variant0;
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
}
