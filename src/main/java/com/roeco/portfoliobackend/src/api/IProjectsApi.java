package com.roeco.portfoliobackend.src.api;

import com.roeco.portfoliobackend.src.constants.ErrorMessages;
import com.roeco.portfoliobackend.src.constants.RoecoConstants;
import com.roeco.portfoliobackend.src.constants.SuccessMessages;
import com.roeco.portfoliobackend.src.entity.Projects;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IProjectsApi {

    @Operation(summary = "Fetch all projects with optional limit")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = SuccessMessages.PROJECTS_LISTED),
            @ApiResponse(responseCode = "404", description = ErrorMessages.PROJECT_NOT_FOUND)
    })
    @GetMapping(RoecoConstants.Projects.FETCH_ALL)
    ResponseEntity<List<Projects>> getProjects(
            @RequestParam(required = false) Integer limit
    );
}