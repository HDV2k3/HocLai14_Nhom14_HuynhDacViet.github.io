package com.example.DeQuestions.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@AllArgsConstructor
@Document(value = "answerEntity")
@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AnswerEntity {
    @Id
    String id;
    String answer;
}
