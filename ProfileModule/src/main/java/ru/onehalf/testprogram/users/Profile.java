package ru.onehalf.testprogram.users;

import javax.persistence.*;

/**
 * Information about user for storing in database
 * <p/>
 * Created: 07.10.12 23:41
 * <p/>
 *
 * @author OneHalf
 */
@Entity
@Table(name = "PROFILES")
public class Profile {

    @Id
    @GeneratedValue
    @Column(name = "UID")
    private Long uid;

    @Column(length = 20, name = "FAMILY")
    private String family;

    @Column(length = 20, name = "SURNAME")
    private String surname;

    @Column(name = "COMPLETED_TESTS")
    private Integer completedTests;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getCompletedTests() {
        return completedTests;
    }

    public void setCompletedTests(Integer completedTests) {
        this.completedTests = completedTests;
    }
}
