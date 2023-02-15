package com.coppel.demo.service;

import com.coppel.demo.entity.Rol;
import com.coppel.demo.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolImplement implements RolService{

    @Autowired
    private RolRepository repository;

    @Override
    public List<Rol> listarRoles() {
        return repository.findAll();
    }

    @Override
    public Rol guardarRol(Rol entity) {
        return repository.save(entity);
    }

    @Override
    public Rol obternerRolPorId(Long idu_rol) {
        return repository.findById(idu_rol).get();
    }

    @Override
    public Rol actualizarRol(Rol entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminarRol(Long idu_rol) {
        repository.deleteById(idu_rol);
    }
}
