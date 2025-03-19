package com.roeco.portfoliobackend.src.service.admin;

import com.roeco.portfoliobackend.src.dto.ProjectRequest;
import com.roeco.portfoliobackend.src.entity.Projects;
import com.roeco.portfoliobackend.src.repo.IProjectsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminProjectsService {

    private final IProjectsRepo projectsRepo;

    public void deleteProject(Integer id) {
        projectsRepo.deleteById(id);
    }

    public Projects saveProject(ProjectRequest projectRequest) {
        Projects project = new Projects();
        project.setName(projectRequest.getName());
        project.setDescription(projectRequest.getDescription());
        project.setToolsLanguages(projectRequest.getToolsLanguages());
        project.setImageUrl(projectRequest.getImageUrl());
        project.setVideoUrl(projectRequest.getVideoUrl());

        return projectsRepo.save(project);
    }


    public Projects updateProject(Integer id, ProjectRequest projectRequest) {
        return projectsRepo.findById(id)
                .map(existingProject -> {
                    existingProject.setName(projectRequest.getName());
                    existingProject.setDescription(projectRequest.getDescription());
                    existingProject.setToolsLanguages(projectRequest.getToolsLanguages());
                    existingProject.setImageUrl(projectRequest.getImageUrl());
                    existingProject.setVideoUrl(projectRequest.getVideoUrl());
                    return projectsRepo.save(existingProject);
                })
                .orElseThrow(() -> new RuntimeException("Project with this ID does not exist: " + id));
    }
}
