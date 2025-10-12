package com.roeco.portfoliobackend.src.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "about_sections")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AboutSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;

    @Column(name = "full_description", columnDefinition = "TEXT")
    private String fullDescription;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "slide_order")
    private Integer order;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @Column(name = "cta_text")
    private String ctaText;

    @Column(name = "cta_link")
    private String ctaLink;

    @Column(name = "category")
    private String category;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ElementCollection
    @CollectionTable(name = "about_work_items", joinColumns = @JoinColumn(name = "about_sections_id"))
    @OrderColumn(name = "position")
    private List<WorkItem> item =new ArrayList<>();


    @Embeddable
    @Data
    public static class WorkItem{
        private String title;
        private String company;
        private LocalDate startDate, endDate;
        @Column(columnDefinition = "TEXT")
        private String blurb;
    }

}