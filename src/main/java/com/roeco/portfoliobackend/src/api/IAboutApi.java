package com.roeco.portfoliobackend.src.api;

import com.roeco.portfoliobackend.src.entity.AboutSection;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IAboutApi {

    @Operation(summary = "Fetch all about sections")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "About sections listed successfully"),
            @ApiResponse(responseCode = "404", description = "No about sections found")
    })
    @GetMapping("/api/v1/about")
    ResponseEntity<List<AboutSection>> getAboutSections();
}