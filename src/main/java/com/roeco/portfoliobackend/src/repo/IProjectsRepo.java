package com.roeco.portfoliobackend.src.repo;

import com.roeco.portfoliobackend.src.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProjectsRepo extends JpaRepository<Projects,Integer> {
    Integer id(Integer id);
}
