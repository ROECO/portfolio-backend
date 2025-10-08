package com.roeco.portfoliobackend.src.service;

import com.roeco.portfoliobackend.src.entity.Projects;
import com.roeco.portfoliobackend.src.repo.IProjectsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProjectsService {
    private final IProjectsRepo projectsRepo;

    @Autowired
    public ProjectsService(IProjectsRepo projectsRepo) {
        this.projectsRepo = projectsRepo;
    }

    public List<Projects> getprojects(Integer limit) {
        List<Projects> projects = projectsRepo.findAll();

        if (limit != null && limit > 0 && limit < projects.size()) {
            return projects.subList(0, limit);
        }

        return projects;
    }

//    public List<Projects> getProjectsByName(String name){
//        return projectsRepo.findByName(name);
//    }
}