package com.roeco.portfoliobackend.src.controller.admin;

import com.roeco.portfoliobackend.src.api.admin.IAdminProjectsApi;
import com.roeco.portfoliobackend.src.constants.SuccessMessages;
import com.roeco.portfoliobackend.src.entity.Projects;
import com.roeco.portfoliobackend.src.service.admin.AdminProjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController  // ✅ Missing annotation added
@RequiredArgsConstructor  // ✅ Constructor injection
public class AdminProjectsController implements IAdminProjectsApi {

    private final AdminProjectsService adminProjectsService;

    @Override
    public ResponseEntity<String> createProject(ProjectRequest projectRequest) {
        Projects newProject = new Projects(); // ✅ Creating a new project instance
        newProject.setName(projectRequest.getName());
        newProject.setDescription(projectRequest.getDescription());
        newProject.setToolsLanguages(projectRequest.getToolsLanguages());
        newProject.setImageUrl(projectRequest.getImageUrl());
        newProject.setVideoUrl(projectRequest.getVideoUrl());

        adminProjectsService.saveProject(newProject);  // ✅ Corrected method call
        return ResponseEntity.ok(SuccessMessages.PROJECT_CREATED);
    }

    @Override
    public ResponseEntity<String> updateProject(Integer id, ProjectRequest projectRequest) {
        Projects updatedProject = new Projects();
        updatedProject.setName(projectRequest.getName());
        updatedProject.setDescription(projectRequest.getDescription());
        updatedProject.setToolsLanguages(projectRequest.getToolsLanguages());
        updatedProject.setImageUrl(projectRequest.getImageUrl());
        updatedProject.setVideoUrl(projectRequest.getVideoUrl());

        adminProjectsService.updateProject(id, updatedProject);
        return ResponseEntity.ok(SuccessMessages.PROJECT_UPDATED);
    }

    @Override
    public ResponseEntity<String> deleteProject(Integer id) {
        adminProjectsService.Deleteprojects(id);
        return ResponseEntity.ok(SuccessMessages.PROJECT_DELETED);
    }
}
