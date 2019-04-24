package com.issatso.springcrypt.entites;

import javax.persistence.Entity;

public class Group {

    private int id_group;
    private int id_projet;

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }
}
