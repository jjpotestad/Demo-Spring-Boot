package com.coppel.demo.service;

import com.coppel.demo.entity.Rol;

import java.util.List;

public interface RolService {

    public List<Rol> listarRoles();

    public Rol guardarRol(Rol entity);

    public Rol obternerRolPorId(Long idu_rol);

    public Rol actualizarRol(Rol entity);

    public void eliminarRol(Long idu_rol);
}
