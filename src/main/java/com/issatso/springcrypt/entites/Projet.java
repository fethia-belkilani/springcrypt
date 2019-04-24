package com.issatso.springcrypt.entites;

import com.issatso.springcrypt.entites.enums.ETAT;

import javax.persistence.*;

@Entity
public class Projet {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_projet;

    private String path_projet;

    private int taille;

    @Enumerated(EnumType.STRING)
    @Column(length = 8)
    private ETAT etat;

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }

    public String getPath_projet() {
        return path_projet;
    }

    public void setPath_projet(String path_projet) {
        this.path_projet = path_projet;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public ETAT getEtat() {
        return etat;
    }

    public void setEtat(ETAT etat) {
        this.etat = etat;
    }
}
