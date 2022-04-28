/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Educacion;
import ar.com.portfolio.portfolio.services.EducacionService;
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
public class EducacionController {
    @Autowired
    private EducacionService educacionService;

    @GetMapping("/educacion")
    public List<Educacion> getAll() {

        return educacionService.traerTodo();
    }
    
    @GetMapping("/educacion/{id}")
    public Educacion getOne(@PathVariable int id) {

        return educacionService.traerUno(id);
    }
    
    @PostMapping("/educacion")
    public boolean create(@RequestBody Educacion ed) {

        return educacionService.crear(ed);
    }
    
    @PutMapping("/educacion")
    public boolean update(@RequestBody Educacion ed) {

        return educacionService.modificar(ed);
    }
    
    @DeleteMapping("/educacion/{id}")
    public boolean remove(@PathVariable int id) {

        return educacionService.borrar(id);
    }    
}
