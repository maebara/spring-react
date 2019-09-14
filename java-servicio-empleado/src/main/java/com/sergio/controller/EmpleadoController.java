package com.sergio.controller;

import com.sergio.entity.Empleado;
import com.sergio.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleado")
    public ResponseEntity<List<Empleado>> getAllEmpleados(){
        return new ResponseEntity<List<Empleado>>(empleadoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleado> getEmpeladoById(@PathVariable long id){
        return new ResponseEntity<Empleado>(empleadoService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/empleado")
    public ResponseEntity<Empleado> saveEmpleado(@RequestBody Empleado empl){
        return new ResponseEntity<Empleado>(empleadoService.save(empl), HttpStatus.OK);
    }

    @PutMapping("/empleado")
    public ResponseEntity<Empleado> updateEmpleado(@RequestBody Empleado empl){
        return new ResponseEntity<Empleado>(empleadoService.update(empl), HttpStatus.OK);
    }

    @DeleteMapping("/empleado/{id}")
    public ResponseEntity<Empleado> deleteEmpleado(@PathVariable long id){
        return new ResponseEntity<Empleado>(empleadoService.delete(id), HttpStatus.OK);
    }



}
