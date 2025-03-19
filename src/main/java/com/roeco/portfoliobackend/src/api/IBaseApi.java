package com.roeco.portfoliobackend.src.api;

import com.roeco.portfoliobackend.src.constants.RoecoConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface IBaseApi {

    @Operation(summary = "Health check for the API")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "API is running"),
    })
    @GetMapping(RoecoConstants.HEALTH_CHECK)
    ResponseEntity<String> healthCheck();

    @Operation(summary = "Fetch API metadata")
    @ApiResponse(responseCode = "200", description = "Returns API metadata")
    @GetMapping(RoecoConstants.API_INFO)
    ResponseEntity<String> getApiInfo();
}
