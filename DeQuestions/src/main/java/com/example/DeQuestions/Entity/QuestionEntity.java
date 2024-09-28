package com.example.DeQuestions.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Getter
@Setter
@AllArgsConstructor
@Document(value = "questionEntity")
@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class QuestionEntity {
    @Id
    String id;
    String question;
    @DBRef
    AnswerEntity answer;
}
