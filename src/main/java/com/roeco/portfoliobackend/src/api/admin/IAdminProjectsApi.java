package com.roeco.portfoliobackend.src.api.admin;

import com.roeco.portfoliobackend.src.constants.RoecoConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface IAdminProjectsApi {


    @PostMapping(RoecoConstants.Admin.CREATE)
    ResponseEntity<String> createProject(@RequestBody ProjectsRequest projectRequest);

    @PutMapping(RoecoConstants.Admin.UPDATE)
    ResponseEntity<String> updateProject(@PathVariable Integer id, @RequestBody ProjectRequest projectRequest);

    @DeleteMapping(RoecoConstants.Admin.DELETE)
    ResponseEntity<String> deleteProject(@PathVariable Integer id);
}
