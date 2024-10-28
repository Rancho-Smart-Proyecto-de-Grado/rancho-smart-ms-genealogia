package com.rancho_smart.ms_genealogia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_genealogia.entity.Genealogia;
import com.rancho_smart.ms_genealogia.repository.GenealogiaRepository;

@Service
public class GenealogiaService {

    @Autowired
    private GenealogiaRepository genealogiaRepository;

    public List<Genealogia> getGenealogias() {
        return this.genealogiaRepository.findAll();
    }

    public Optional<Genealogia> getGenealogiaById(Long id) {
        return this.genealogiaRepository.findById(id);
    }

    public Genealogia saveGenealogia(Genealogia genealogia) {
        return this.genealogiaRepository.save(genealogia);
    }

    public void deleteGenealogia(Long id) {
        this.genealogiaRepository.deleteById(id);
    }
}
