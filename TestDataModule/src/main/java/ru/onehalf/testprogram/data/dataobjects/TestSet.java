package ru.onehalf.testprogram.data.dataobjects;

import javax.persistence.*;

/**
 * Данные о наборе тестов
 * <p/>
 * <p/>
 * Created: 15.04.12 16:41
 * <p/>
 *
 * @author OneHalf
 */
@Entity
@Table(name = "TEST_SETS")
public class TestSet {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
