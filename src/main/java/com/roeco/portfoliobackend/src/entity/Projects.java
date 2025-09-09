package com.roeco.portfoliobackend.src.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    @Nonnull
    private String name;

    @Column(length = 255, nullable = false)
    @Nonnull
    private String description;

    @ElementCollection
    @CollectionTable(name = "tools_languages", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "tool_language", nullable = false)
    @OrderColumn(name = "position") // <- add if order matters
    private List<String> toolsLanguages = new ArrayList<>();

    @Column(length = 255)
    private String imageUrl;

    @Column(length = 255)
    private String videoUrl;


}
