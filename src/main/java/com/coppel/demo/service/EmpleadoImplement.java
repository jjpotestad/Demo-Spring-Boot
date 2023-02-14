package com.coppel.demo.service;

import com.coppel.demo.entity.Empleado;
import com.coppel.demo.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadoImplement implements EmpleadoService {
    @Autowired
    private EmpleadoRepository repository;
    
    @Override
    public List<Empleado> listarEmpleados() {
        return repository.findAll();
    }

    @Override
    public Empleado guardarEmpleado(Empleado entity) {
        return repository.save(entity);
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Long num_empleado) {
        return repository.findById(num_empleado).get();
    }

    @Override
    public Empleado actualizarEmpleado(Empleado entity) {
        return repository.save(entity);
    }

    @Override
    public void eliminarEmpleado(Long num_empleado) {
        repository.deleteById(num_empleado);
    }
}
