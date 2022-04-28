/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Proyectos;
import ar.com.portfolio.portfolio.services.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yo
 */
@CrossOrigin("*")
@RestController
public class ProyectosController {
    @Autowired
    private ProyectosService proyectosService;

    @GetMapping("/proyectos")
    public List<Proyectos> getAll() {

        return proyectosService.traerTodo();
    }
    
    @GetMapping("/proyectos/{id}")
    public Proyectos getOne(@PathVariable int id) {

        return proyectosService.traerUno(id);
    }
    
    @PostMapping("/proyectos")
    public boolean create(@RequestBody Proyectos pr) {

        return proyectosService.crear(pr);
    }
    
    @PutMapping("/proyectos")
    public boolean update(@RequestBody Proyectos pr) {

        return proyectosService.modificar(pr);
    }
    
    @DeleteMapping("/proyectos/{id}")
    public boolean remove(@PathVariable int id) {

        return proyectosService.borrar(id);
    }    
}

