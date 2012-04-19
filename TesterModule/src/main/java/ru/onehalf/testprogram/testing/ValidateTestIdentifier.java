package ru.onehalf.testprogram.testing;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * <p/>
 * <p/>
 * Created: 13.04.12 0:04
 * <p/>
 *
 * @author OneHalf
 */
public class ValidateTestIdentifier {

    @NotNull(message = "TestSet.Validation.NotNull")
    @Min(value = 0, message = "TestSet.Validation.Min")
    private Integer testSet;

    @NotNull(message = "TestNumber.Validation.NotNull")
    @Min(value = 0, message = "TestNumber.Validation.Min")
    private Integer testNumber;

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
