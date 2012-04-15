package ru.onehalf.testprogram.testing;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * <p/>
 * <p/>
 * Created: 15.04.12 13:08
 * <p/>
 *
 * @author OneHalf
 */
public class QuestionAnswer {

    @NotNull
    @Min(0)
    private Integer variant;

    @NotNull
    @Min(0)
    private  Integer testSet;

    @NotNull
    @Min(0)
    private  Integer testNumber;

    public Integer getVariant() {
        return variant;
    }

    public void setVariant(Integer variant) {
        this.variant = variant;
    }

    public Integer getTestSet() {
        return testSet;
    }

    public void setTestSet(Integer testSet) {
        this.testSet = testSet;
    }

    public Integer getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Integer testNumber) {
        this.testNumber = testNumber;
    }
}
