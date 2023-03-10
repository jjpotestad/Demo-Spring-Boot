package com.coppel.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cedis")
public class Cedis {
    @Id
    @Column(name = "uuid", nullable = false, unique = true)
    private Long uuid;

    @Column(name = "nom_cedis", nullable = false, length = 100)
    private String nom_cedis;

    @Column(name = "num_cedisropa", nullable = false)
    private Integer num_cedisropa;

    @Column(name = "num_cedimueble", nullable = false)
    private Integer num_cedimueble;

    @Column(name = "des_servidorropa", nullable = false, length = 100)
    private String des_servidorropa;

    @Column(name = "des_servidormueble", nullable = false, length = 100)
    private String des_servidormueble;

    public Cedis() {
    }

    public Cedis(Long uuid, String nom_cedis, Integer num_cedisropa, Integer num_cedimueble, String des_servidorropa,
            String des_servidormueble) {
        this.uuid = uuid;
        this.nom_cedis = nom_cedis;
        this.num_cedisropa = num_cedisropa;
        this.num_cedimueble = num_cedimueble;
        this.des_servidorropa = des_servidorropa;
        this.des_servidormueble = des_servidormueble;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getNom_cedis() {
        return nom_cedis;
    }

    public void setNom_cedis(String nom_cedis) {
        this.nom_cedis = nom_cedis;
    }

    public Integer getNum_cedisropa() {
        return num_cedisropa;
    }

    public void setNum_cedisropa(Integer num_cedisropa) {
        this.num_cedisropa = num_cedisropa;
    }

    public Integer getNum_cedimueble() {
        return num_cedimueble;
    }

    public void setNum_cedimueble(Integer num_cedimueble) {
        this.num_cedimueble = num_cedimueble;
    }

    public String getDes_servidorropa() {
        return des_servidorropa;
    }

    public void setDes_servidorropa(String des_servidorropa) {
        this.des_servidorropa = des_servidorropa;
    }

    public String getDes_servidormueble() {
        return des_servidormueble;
    }

    public void setDes_servidormueble(String des_servidormueble) {
        this.des_servidormueble = des_servidormueble;
    }

    @Override
    public String toString() {
        return "Cedis{" +
                "uuid=" + uuid +
                ", nom_cedis='" + nom_cedis + '\'' +
                ", num_cedisropa=" + num_cedisropa +
                ", num_cedimueble=" + num_cedimueble +
                ", des_servidorropa='" + des_servidorropa + '\'' +
                ", des_servidormueble='" + des_servidormueble + '\'' +
                '}';
    }
}
