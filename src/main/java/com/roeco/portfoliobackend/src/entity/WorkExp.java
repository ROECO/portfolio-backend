package com.roeco.portfoliobackend.src.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "work_exp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkExp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String company;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDate startDate;

    @Column(columnDefinition = "DATE")
    private LocalDate endDate;

    @Column(columnDefinition = "TEXT", nullable = false )
    private String blurb;

    @Column(nullable = false)
    private int order;



}
