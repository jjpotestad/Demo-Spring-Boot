package com.coppel.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idu_rol;

    @Column(name = "num_rol", nullable = false)
    private Integer num_rol;

    @Column(name = "nom_rol", nullable = false, length = 100)
    private String nom_rol;

    public Rol() {}

    public Rol(Long idu_rol, Integer num_rol, String nom_rol) {
        this.idu_rol = idu_rol;
        this.num_rol = num_rol;
        this.nom_rol = nom_rol;
    }

    public Long getIdu_rol() {
        return idu_rol;
    }

    public void setIdu_rol(Long idu_rol) {
        this.idu_rol = idu_rol;
    }

    public Integer getNum_rol() {
        return num_rol;
    }

    public void setNum_rol(Integer num_rol) {
        this.num_rol = num_rol;
    }

    public String getNom_rol() {
        return nom_rol;
    }

    public void setNom_rol(String nom_rol) {
        this.nom_rol = nom_rol;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idu_rol=" + idu_rol +
                ", num_rol=" + num_rol +
                ", nom_rol='" + nom_rol + '\'' +
                '}';
    }
}
