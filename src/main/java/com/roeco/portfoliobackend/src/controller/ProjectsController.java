package com.roeco.portfoliobackend.src.controller;

import com.roeco.portfoliobackend.src.api.IProjectsApi;
import com.roeco.portfoliobackend.src.entity.Projects;
import com.roeco.portfoliobackend.src.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectsController implements IProjectsApi{

    private final ProjectsService projectsService;

    @Autowired
    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @Override
    public ResponseEntity<List<Projects>> getProjects(
            @RequestParam(required = false) Integer limit
    ) {
        return ResponseEntity.ok(projectsService.getprojects(limit));
    }
}