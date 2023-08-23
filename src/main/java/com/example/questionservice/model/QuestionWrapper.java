package com.example.questionservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuestionWrapper {

    private int id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;

    public QuestionWrapper(int id, String questionTitle, String option1, String option2, String option3) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }
}
