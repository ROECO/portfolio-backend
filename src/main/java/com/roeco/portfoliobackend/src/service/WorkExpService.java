package com.roeco.portfoliobackend.src.service;

import com.roeco.portfoliobackend.src.constants.ErrorMessages;
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
        if (workExpRepo.findAll().isEmpty()){
            throw new RuntimeException(ErrorMessages.WORKEXP_NOT_FOUND);
        }
        return workExpRepo.findAllByOrderByOrderIndexAsc();
    }

//    public void moveWorkExperience(Long workExpId, int newPosition) {
//        List<WorkExp> experiences = workExpRepo.findAllByOrderByOrderIndexAsc();
//
//        // Remove the one being moved
//        WorkExp target = experiences.stream()
//                .filter(e -> e.getId().equals(workExpId))
//                .findFirst().orElseThrow();
//
//        experiences.remove(target);
//        experiences.add(newPosition, target);
//
//        // Reassign order indices
//        for (int i = 0; i < experiences.size(); i++) {
//            experiences.get(i).setOrderIndex(i);
//        }
//
//       workExpRepo.saveAll(experiences);
//    }

}
