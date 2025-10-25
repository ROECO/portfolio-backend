package com.roeco.portfoliobackend.src.repo;

import com.roeco.portfoliobackend.src.entity.WorkExp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IWorkExpRepo extends JpaRepository<WorkExp,Integer> {
    List<WorkExp> findAllByOrderByOrderIndexAsc();
    WorkExp getWorkExpById(Integer id);
}
