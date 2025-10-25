package com.roeco.portfoliobackend.src.controller;

import com.roeco.portfoliobackend.src.entity.WorkExp;
import com.roeco.portfoliobackend.src.service.WorkExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkExpController {

    private final WorkExpService workExpService;

    @Autowired
    public WorkExpController(WorkExpService workExpService){this.workExpService = workExpService;}


    public ResponseEntity<List<WorkExp>> findAllByOrder(){
        return ResponseEntity.ok(workExpService.findAllByOrder());
    }


}
