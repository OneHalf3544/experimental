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

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "QUESTION_ID")
    private Long questionId;
    
    @Column(name = "TEXT")
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
