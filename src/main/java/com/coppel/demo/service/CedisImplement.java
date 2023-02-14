package com.coppel.demo.service;

import com.coppel.demo.entity.Cedis;
import com.coppel.demo.repository.CedisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CedisImplement implements CedisService{
    @Autowired
    private CedisRepository repository;

    @Override
    public List<Cedis> listarCedis() {
        return repository.findAll();
    }

    @Override
    public Cedis guardarCedis(Cedis entity) {
        return repository.save(entity);
    }

    @Override
    public Cedis obtenerCedisPorId(Long uuid) {
        return repository.findById(uuid).get();
    }

    @Override
    public Cedis actualizarCedis(Cedis entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminarCedis(Long uuid) {
        repository.deleteById(uuid);
    }
}
