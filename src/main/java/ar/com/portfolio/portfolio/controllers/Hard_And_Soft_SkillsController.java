/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.controllers;

import ar.com.portfolio.portfolio.models.Hard_And_Soft_Skills;
import ar.com.portfolio.portfolio.services.Hard_And_Soft_SkillsService;
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
public class Hard_And_Soft_SkillsController {
    @Autowired
    private Hard_And_Soft_SkillsService hard_and_soft_skillsService;

    @GetMapping("/hard_and_soft_skills")
    public List<Hard_And_Soft_Skills> getAll() {

        return hard_and_soft_skillsService.traerTodo();
    }
    
    @GetMapping("/hard_and_soft_skills/{id}")
    public Hard_And_Soft_Skills getOne(@PathVariable int id) {

        return hard_and_soft_skillsService.traerUno(id);
    }
    
    @PostMapping("/hard_and_soft_skills")
    public boolean create(@RequestBody Hard_And_Soft_Skills h) {

        return hard_and_soft_skillsService.crear(h);
    }
    
    @PutMapping("/hard_and_soft_skills")
    public boolean update(@RequestBody Hard_And_Soft_Skills h) {

        return hard_and_soft_skillsService.modificar(h);
    }
    
    @DeleteMapping("/hard_and_soft_skills/{id}")
    public boolean remove(@PathVariable int id) {

        return hard_and_soft_skillsService.borrar(id);
    }    
}

