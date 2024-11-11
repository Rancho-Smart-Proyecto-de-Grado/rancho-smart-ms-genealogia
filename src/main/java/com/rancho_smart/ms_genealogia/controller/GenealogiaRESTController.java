package com.rancho_smart.ms_genealogia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rancho_smart.ms_genealogia.entity.Genealogia;
import com.rancho_smart.ms_genealogia.service.GenealogiaService;

@RestController
@RequestMapping(path = "/genealogias")
public class GenealogiaRESTController {

    @Autowired
    private GenealogiaService genealogiaService;

    @GetMapping
    public ResponseEntity<List<Genealogia>> getAllGenealogias() {
        List<Genealogia> listado = this.genealogiaService.getGenealogias();
        return new ResponseEntity<>(listado, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genealogia> getGenealogiaById(@PathVariable Long id) {
        Optional<Genealogia> genealogia = this.genealogiaService.getGenealogiaById(id);
        return genealogia.map(ResponseEntity::ok)
                         .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Genealogia> saveGenealogia(@RequestBody Genealogia genealogia) {
        Genealogia genealogiaCreada = this.genealogiaService.saveGenealogia(genealogia);
        return new ResponseEntity<>(genealogiaCreada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genealogia> updateGenealogia(@PathVariable Long id, @RequestBody Genealogia genealogia) {
        if (!this.genealogiaService.getGenealogiaById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            genealogia.setIdGenealogia(id);
            Genealogia genealogiaActualizada = this.genealogiaService.saveGenealogia(genealogia);
            return new ResponseEntity<>(genealogiaActualizada, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenealogia(@PathVariable Long id) {
        if (!this.genealogiaService.getGenealogiaById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.genealogiaService.deleteGenealogia(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
