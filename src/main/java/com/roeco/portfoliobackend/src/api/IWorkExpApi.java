package com.roeco.portfoliobackend.src.api;

import com.roeco.portfoliobackend.src.constants.ErrorMessages;
import com.roeco.portfoliobackend.src.constants.SuccessMessages;
import com.roeco.portfoliobackend.src.entity.WorkExp;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IWorkExpApi {
    @Operation(summary = "Fetch all Work Exp by Order")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = SuccessMessages.WORKEXP_LISTED),
            @ApiResponse(responseCode = "404", description = ErrorMessages.WORKEXP_NOT_FOUND)
    })
    @GetMapping("/api/v1/workexp")
    ResponseEntity<List<WorkExp>> findAllByOrderIndex();

}
