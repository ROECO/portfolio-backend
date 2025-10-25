package com.roeco.portfoliobackend.src.service;

import com.roeco.portfoliobackend.src.constants.ErrorMessages;
import com.roeco.portfoliobackend.src.constants.exception.ResourceNotFoundException;
import com.roeco.portfoliobackend.src.entity.AboutSection;
import com.roeco.portfoliobackend.src.repo.IAboutSectionRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.HttpCodeStatusMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AboutSectionService {

    private final IAboutSectionRepo aboutSectionRepo;
    private final HttpCodeStatusMapper httpCodeStatusMapper;

    @Autowired
    public AboutSectionService(IAboutSectionRepo aboutSectionRepo, HttpCodeStatusMapper httpCodeStatusMapper) {
        this.aboutSectionRepo = aboutSectionRepo;
        this.httpCodeStatusMapper = httpCodeStatusMapper;
    }

    public List<AboutSection> getAboutSections() {
//        log.info("Fetching all active about sections");
        return aboutSectionRepo.findByIsActiveTrueOrderByOrderAsc();
    }
    public AboutSection getAboutSectionById(Long id){
        if(id == null){
           throw new ResourceNotFoundException(ErrorMessages.ABOUT_NOT_FOUND + "non existent or null");
        }
        return aboutSectionRepo.getAboutSectionById(id);
    }

}