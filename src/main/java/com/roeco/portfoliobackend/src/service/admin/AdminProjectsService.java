package com.roeco.portfoliobackend.src.service.admin;

import com.roeco.portfoliobackend.src.entity.Projects;
import com.roeco.portfoliobackend.src.repo.IProjectsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminProjectsService {
    private final IProjectsRepo projectsRepo;
    @Autowired
    public AdminProjectsService(IProjectsRepo projectsRepo) {
        this.projectsRepo = projectsRepo;
    }

    public void  Deleteprojects(Integer id) {
        projectsRepo.deleteById(id);
    }

    public Projects saveProject(Projects project) {
        return projectsRepo.save(project);
    }

    public Projects updateProject(Integer id,Projects updateproject) {
        return projectsRepo.findById(id)
                .map(existingProject->{
                    existingProject.setName(updateproject.getName());
                    existingProject.setDescription(updateproject.getDescription());
                    existingProject.setToolsLanguages(updateproject.getToolsLanguages());
                    existingProject.setImageUrl(updateproject.getImageUrl());
                    existingProject.setVideoUrl(updateproject.getVideoUrl());
                    return projectsRepo.save(existingProject);
                })
                .orElseThrow(()-> new RuntimeException("the project with this id doesnt exist:" + id));
    }
}
