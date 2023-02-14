package com.coppel.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @Column(name = "num_empleado", nullable = false, unique = true)
    private Long num_empleado;

    @Column(name = "nom_empleado", nullable = false, length = 100)
    private String nom_empleado;

    @Column(name = "fec_ingreso")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fec_ingreso;

    @Column(name = "fec_cumple")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fec_cumple;

    @Column(name = "opc_interno", nullable = false, length = 100)
    private String opc_interno;

    public Empleado() {
    }

    public Empleado(Long num_empleado, String nom_empleado, LocalDate fec_ingreso, LocalDate fec_cumple, String opc_interno) {
        this.num_empleado = num_empleado;
        this.nom_empleado = nom_empleado;
        this.fec_ingreso = fec_ingreso;
        this.fec_cumple = fec_cumple;
        this.opc_interno = opc_interno;
    }

    @Override
    public String toString() {
        return "Empleado{" + "num_empleado=" + num_empleado + ", nom_empleado=" + nom_empleado + ", fec_ingreso=" + fec_ingreso + ", fec_cumple=" + fec_cumple + ", opc_interno=" + opc_interno + '}';
    }

    public Long getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(Long num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getNom_empleado() {
        return nom_empleado;
    }

    public void setNom_empleado(String nom_empleado) {
        this.nom_empleado = nom_empleado;
    }

    public LocalDate getFec_ingreso() {
        return fec_ingreso;
    }

    public void setFec_ingreso(LocalDate fec_ingreso) {
        this.fec_ingreso = fec_ingreso;
    }

    public LocalDate getFec_cumple() {
        return fec_cumple;
    }

    public void setFec_cumple(LocalDate fec_cumple) {
        this.fec_cumple = fec_cumple;
    }

    public String getOpc_interno() {
        return opc_interno;
    }

    public void setOpc_interno(String opc_interno) {
        this.opc_interno = opc_interno;
    }
}
