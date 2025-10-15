package com.roeco.portfoliobackend.src.controller;

import com.roeco.portfoliobackend.src.api.IAboutApi;
import com.roeco.portfoliobackend.src.entity.AboutSection;
import com.roeco.portfoliobackend.src.service.AboutSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AboutController implements IAboutApi {

    private final AboutSectionService aboutSectionService;

    @Autowired
    public AboutController(AboutSectionService aboutSectionService) {
        this.aboutSectionService = aboutSectionService;
    }

    @Override
    public ResponseEntity<List<AboutSection>> getAboutSections() {
        return ResponseEntity.ok(aboutSectionService.getAboutSections());
    }
    @Override
    public ResponseEntity<AboutSection> getAboutSectionById(Long id){
        return ResponseEntity.ok(aboutSectionService.getAboutSectionById(id));
    }
}