package com.roeco.portfoliobackend.src.api;

import com.roeco.portfoliobackend.src.constants.ErrorMessages;
import com.roeco.portfoliobackend.src.entity.AboutSection;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IAboutApi {

    @Operation(summary = "Fetch all about sections")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "About sections listed successfully"),
            @ApiResponse(responseCode = "404", description = "No about sections found"),
            @ApiResponse(responseCode = "400", description = ErrorMessages.DOES_NOT_EXIST)
    })
    @GetMapping("/api/v1/about")
    ResponseEntity<List<AboutSection>> getAboutSections();
    @Operation(summary = "Fetch an about section by ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "About section fetched successfully"),
            @ApiResponse(responseCode = "404", description = "About section not found"),
            @ApiResponse(responseCode = "400", description = ErrorMessages.DOES_NOT_EXIST)
    })
    @GetMapping("/api/v1/about/{id}")
    ResponseEntity<AboutSection> getAboutSectionById(@PathVariable Long id);
}