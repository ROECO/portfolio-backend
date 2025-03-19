package com.roeco.portfoliobackend.src.controller.admin;

import com.roeco.portfoliobackend.src.api.admin.IAdminProjectsApi;
import com.roeco.portfoliobackend.src.constants.SuccessMessages;
import com.roeco.portfoliobackend.src.dto.ProjectRequest;
import com.roeco.portfoliobackend.src.service.admin.AdminProjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminProjectsController implements IAdminProjectsApi {

    private final AdminProjectsService adminProjectsService;

    @Override
    public ResponseEntity<String> createProject(ProjectRequest projectRequest) {
        adminProjectsService.saveProject(projectRequest);
        return ResponseEntity.ok(SuccessMessages.PROJECT_CREATED);
    }

    @Override
    public ResponseEntity<String> updateProject(Integer id, ProjectRequest projectRequest) {
        adminProjectsService.updateProject(id, projectRequest);
        return ResponseEntity.ok(SuccessMessages.PROJECT_UPDATED);
    }

    @Override
    public ResponseEntity<String> deleteProject(Integer id) {
        adminProjectsService.deleteProject(id);
        return ResponseEntity.ok(SuccessMessages.PROJECT_DELETED);
    }
}
