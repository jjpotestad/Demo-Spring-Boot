package com.coppel.demo.service;

import com.coppel.demo.entity.Cedis;

import java.util.List;

public interface CedisService {
    public List<Cedis> listarCedis();

    public Cedis guardarCedis(Cedis entity);
	
	public Cedis obtenerCedisPorId(Long uuid);
	
	public Cedis actualizarCedis(Cedis entity);
	
	public void eliminarCedis(Long uuid);
}
