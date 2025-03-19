package com.roeco.portfoliobackend.src.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProjectRequest {
    @NotBlank(message = "Project name is required")
    private String name;
    private String description;
    private List<String> toolsLanguages;
    private String imageUrl;
    private String videoUrl;
}
