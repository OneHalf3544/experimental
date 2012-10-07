package ru.onehalf.testprogram.creator;

/**
 * <p/>
 * <p/>
 * Created: 20.04.12 11:44
 * <p/>
 *
 * @author OneHalf
 */
public class CreatedTestSet {

    /**
     * testSetId
     */
    private Long testSetId;

    /**
     * Description of test set
     */
    private String name;

    /**
     * Detailed description of test set
     */
    private String description;

    public Long getTestSetId() {
        return testSetId;
    }

    public void setTestSetId(Long testSetId) {
        this.testSetId = testSetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
