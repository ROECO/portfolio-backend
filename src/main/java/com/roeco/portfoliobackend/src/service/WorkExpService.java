package com.roeco.portfoliobackend.src.service;

import com.roeco.portfoliobackend.src.entity.WorkExp;
import com.roeco.portfoliobackend.src.repo.IWorkExpRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class WorkExpService {
    private final IWorkExpRepo workExpRepo;
    @Autowired
    public WorkExpService(IWorkExpRepo workExpRepo){this.workExpRepo = workExpRepo;}

    public List<WorkExp> findAllByOrder() {
        return workExpRepo.findAllByOrderByOrderAsc();
    }
}
