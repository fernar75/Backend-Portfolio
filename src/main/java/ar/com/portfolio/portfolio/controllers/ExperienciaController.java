/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Experiencia;
import ar.com.portfolio.portfolio.services.ExperienciaService;
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
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;

    @GetMapping("/experiencia")
    public List<Experiencia> getAll() {

        return experienciaService.traerTodo();
    }
    
    @GetMapping("/experiencia/{id}")
    public Experiencia getOne(@PathVariable int id) {

        return experienciaService.traerUno(id);
    }
    
    @PostMapping("/experiencia")
    public boolean create(@RequestBody Experiencia ex) {

        return experienciaService.crear(ex);
    }
    
    @PutMapping("/experiencia")
    public boolean update(@RequestBody Experiencia ex) {

        return experienciaService.modificar(ex);
    }
    
    @DeleteMapping("/experiencia/{id}")
    public boolean remove(@PathVariable int id) {

        return experienciaService.borrar(id);
    }    
}
