package com.test.brainOut.entity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "word_master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WordMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String word;

    @Column(nullable = false)
    private String clue;
}
