package ru.onehalf.testprogram.data.dataobjects;

import javax.persistence.*;

/**
 * <p/>
 * <p/>
 * Created: 14.04.12 11:56
 * <p/>
 *
 * @author OneHalf
 */
@Entity
@Table(name = "VARIANTS")
public class Variant {

    public Variant() {
    }

    public Variant(TestQuestion question, String text) {
        this.question = question;
        this.text = text;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private TestQuestion question;
    
    @Column(name = "TEXT")
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TestQuestion getQuestion() {
        return question;
    }

    public void setQuestion(TestQuestion question) {
        this.question = question;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
