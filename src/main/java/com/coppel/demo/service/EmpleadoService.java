package com.coppel.demo.service;

import com.coppel.demo.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    public List<Empleado> listarEmpleados();

    public Empleado guardarEmpleado(Empleado entity);
	
	public Empleado obtenerEmpleadoPorId(Long num_empleado);
	
	public Empleado actualizarEmpleado(Empleado entity);
	
	public void eliminarEmpleado(Long num_empleado);
}
