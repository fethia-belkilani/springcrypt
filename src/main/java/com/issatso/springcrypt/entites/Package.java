package com.issatso.springcrypt.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Package {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_package;
}
