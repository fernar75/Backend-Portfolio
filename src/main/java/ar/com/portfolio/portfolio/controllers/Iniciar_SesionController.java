/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Iniciar_Sesion;
import ar.com.portfolio.portfolio.services.Iniciar_SesionService;
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
public class Iniciar_SesionController {
    @Autowired
    private Iniciar_SesionService iniciar_sesionService;

    @GetMapping("/iniciar_sesion")
    public List<Iniciar_Sesion> getAll() {

        return iniciar_sesionService.traerTodo();
    }
    
    @GetMapping("/iniciar_sesion/{id}")
    public Iniciar_Sesion getOne(@PathVariable int id) {

        return iniciar_sesionService.traerUno(id);
    }
    
    @PostMapping("/iniciar_sesion")
    public boolean create(@RequestBody Iniciar_Sesion i) {

        return iniciar_sesionService.crear(i);
    }
    
    @PutMapping("/iniciar_sesion")
    public boolean update(@RequestBody Iniciar_Sesion i) {

        return iniciar_sesionService.modificar(i);
    }
    
    @DeleteMapping("/iniciar_sesion/{id}")
    public boolean remove(@PathVariable int id) {

        return iniciar_sesionService.borrar(id);
    }    
}

