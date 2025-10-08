package com.roeco.portfoliobackend.src.service;

import com.roeco.portfoliobackend.src.entity.AboutSection;
import com.roeco.portfoliobackend.src.repo.IAboutSectionRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AboutSectionService {

    private final IAboutSectionRepo aboutSectionRepo;

    @Autowired
    public AboutSectionService(IAboutSectionRepo aboutSectionRepo) {
        this.aboutSectionRepo = aboutSectionRepo;
    }

    public List<AboutSection> getAboutSections() {
        log.info("Fetching all active about sections");
        return aboutSectionRepo.findByIsActiveTrueOrderByOrderAsc();
    }
}