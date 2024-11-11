package com.rancho_smart.ms_genealogia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_genealogia.entity.Genealogia;

@Repository
public interface GenealogiaRepository extends JpaRepository<Genealogia, Long>{
    
}
