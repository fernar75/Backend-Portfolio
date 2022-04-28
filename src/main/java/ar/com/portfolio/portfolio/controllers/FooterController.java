/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Footer;
import ar.com.portfolio.portfolio.services.FooterService;
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
public class FooterController {
    @Autowired
    private FooterService footerService;

    @GetMapping("/footer")
    public List<Footer> getAll() {

        return footerService.traerTodo();
    }
    
    @GetMapping("/footer/{id}")
    public Footer getOne(@PathVariable int id) {

        return footerService.traerUno(id);
    }
    
    @PostMapping("/footer")
    public boolean create(@RequestBody Footer f) {

        return footerService.crear(f);
    }
    
    @PutMapping("/footer")
    public boolean update(@RequestBody Footer f) {

        return footerService.modificar(f);
    }
    
    @DeleteMapping("/footer/{id}")
    public boolean remove(@PathVariable int id) {

        return footerService.borrar(id);
    }    
}
