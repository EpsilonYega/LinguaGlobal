package org.api.entity;

import jakarta.persistence.*;
import lombok.*;
import org.api.dto.Language;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "questions")
public class Questions {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_id_seq")
    @SequenceGenerator(name = "question_id_seq", sequenceName = "question_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "language")
    private Language language;

    @Column(name = "question")
    private String question;

    @Column(name = "correct_answer")
    private String correctAnswer;

    @Column(name = "unfinished_answer")
    private String unfinishedAnswer;

    @Column(name = "count_of_missed_symbols")
    private int countOfMissedSymbols;

    @Column(name = "first_wrong_answer")
    private String firstWrongAnswer;

    @Column(name = "second_wrong_answer")
    private String secondWrongAnswer;
}
