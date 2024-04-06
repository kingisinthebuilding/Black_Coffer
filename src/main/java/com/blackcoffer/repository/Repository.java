package com.blackcoffer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blackcoffer.model.Model;

public interface Repository extends JpaRepository<Model, String> {

    @Query("SELECT t.intensity FROM Model t")
    List<String> getIntensity();
    
    @Query("SELECT t.likelihood FROM Model t")
    List<String> getLikelihood();
    
    @Query("SELECT t.relevance FROM Model t")
    List<String> getRelevance();
    
    @Query("SELECT t.year FROM Model t")
    List<String> getYear();
    
    @Query("SELECT t.country FROM Model t")
    List<String> getCountry();
    
    @Query("SELECT t.topics FROM Model t")
    List<String> getTopic();
    
    @Query("SELECT t.region FROM Model t")
    List<String> getRegion();
    
    @Query("SELECT t.city FROM Model t")
    List<String> getCity();
}
