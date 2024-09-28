package com.test.brainOut.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "point_game")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PointGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer Id;

    @Column(nullable = false)
    private String username;

    private Integer totalPoint;
}
