package com.roeco.portfoliobackend.src.repo;

import com.roeco.portfoliobackend.src.entity.AboutSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAboutSectionRepo extends JpaRepository<AboutSection, Long> {
    List<AboutSection> findByIsActiveTrueOrderByOrderAsc();
    AboutSection getAboutSectionById(Long id);
}