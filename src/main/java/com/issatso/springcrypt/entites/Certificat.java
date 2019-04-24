package com.issatso.springcrypt.entites;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Certificat {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_certificat;

    private String nom;

    @Temporal(TemporalType.DATE)
    private Date date_creation;

    @Temporal(TemporalType.DATE)
    private Date date_expiration;

    private String pays;

    public int getId_certificat() {
        return id_certificat;
    }

    public void setId_certificat(int id_certificat) {
        this.id_certificat = id_certificat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
