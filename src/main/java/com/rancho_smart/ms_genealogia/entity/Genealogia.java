package com.rancho_smart.ms_genealogia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GENEALOGIA")
public class Genealogia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenealogia;
    
    @Column(name = "ID_ANIMAL")
    private Long idAnimal;

    @Column(name = "ID_PADRE")
    private Long idPadre;

    @Column(name = "ID_MADRE")
    private Long idMadre;

    @Column(name = "PADRE")
    private String padre;

    public Genealogia(Long idAnimal, Long idPadre, Long idMadre, String padre) {
        this.idAnimal = idAnimal;
        this.idPadre = idPadre;
        this.idMadre = idMadre;
        this.padre = padre;
    }

    public Genealogia() {
    }

    public Long getIdGenealogia() {
        return idGenealogia;
    }

    public void setIdGenealogia(Long idGenealogia) {
        this.idGenealogia = idGenealogia;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public Long getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(Long idMadre) {
        this.idMadre = idMadre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    
}
