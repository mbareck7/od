package com.mpiag.apistage.persistance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    String valeur;
    public String getValeur() {
        return valeur;
    }
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}
