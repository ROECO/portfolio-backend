package com.roeco.portfoliobackend.src.api.admin;

import com.roeco.portfoliobackend.src.constants.RoecoConstants;
import com.roeco.portfoliobackend.src.dto.ProjectRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface IAdminProjectsApi {


    @PostMapping(RoecoConstants.Admin.CREATE)
    ResponseEntity<String> createProject(@RequestBody ProjectRequest projectRequest);

    @PutMapping(RoecoConstants.Admin.UPDATE)
    ResponseEntity<String> updateProject(@PathVariable Integer id, @RequestBody ProjectRequest projectRequest);

    @DeleteMapping(RoecoConstants.Admin.DELETE)
    ResponseEntity<String> deleteProject(@PathVariable Integer id);
}
