package org.api.entity;

import jakarta.persistence.*;
import lombok.*;
import org.api.dto.Language;
import org.api.dto.LanguageLevel;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_language_levels")
public class UserLanguageLevels {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_language_level_id_seq")
    @SequenceGenerator(name = "user_language_level_id_seq", sequenceName = "user_language_level_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "language")
    private Language language;

    @Enumerated(EnumType.STRING)
    @Column(name = "language_level")
    private LanguageLevel languageLevel;
}
