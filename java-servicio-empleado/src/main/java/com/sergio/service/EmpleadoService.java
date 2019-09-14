package com.sergio.service;

import com.sergio.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    List<Empleado> findAll();
    Empleado findById(long id);
    Empleado save(Empleado emp);
    Empleado update(Empleado emp);
    Empleado delete(long id);
}
