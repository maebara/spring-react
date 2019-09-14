package com.sergio.service;

import com.sergio.entity.Empleado;
import com.sergio.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements  EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;


    @Override
    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado findById(long id) {
        return empleadoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public Empleado save(Empleado emp) {
        return empleadoRepository.save(emp);
    }

    @Override
    public Empleado update(Empleado emp) {
        return empleadoRepository.save(emp);
    }

    @Override
    public Empleado delete(long id) {
        Empleado empl = empleadoRepository.findById(id)
                .orElse(null);
        empleadoRepository.deleteById(id);
        return empl;
    }
}
