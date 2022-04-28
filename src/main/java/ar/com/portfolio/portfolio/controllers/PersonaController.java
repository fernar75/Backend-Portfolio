/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Persona;
import ar.com.portfolio.portfolio.services.PersonaService;
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
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> getAll() {

        return personaService.traerTodo();
    }
    
    @GetMapping("/personas/{id}")
    public Persona getOne(@PathVariable int id) {

        return personaService.traerUno(id);
    }
    
    @PostMapping("/personas")
    public boolean create(@RequestBody Persona p) {

        return personaService.crear(p);
    }
    
    @PutMapping("/personas")
    public boolean update(@RequestBody Persona p) {

        return personaService.modificar(p);
    }
    
    @DeleteMapping("/personas/{id}")
    public boolean remove(@PathVariable int id) {

        return personaService.borrar(id);
    }
}
