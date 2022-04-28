/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Hard_And_Soft_Skills;
import ar.com.portfolio.portfolio.repositories.IHard_And_Soft_SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class Hard_And_Soft_SkillsService implements ICrudService<Hard_And_Soft_Skills> {

    @Autowired
    IHard_And_Soft_SkillsRepository hard_and_soft_skillsRepo;

    @Override
    public List<Hard_And_Soft_Skills> traerTodo() {
        return hard_and_soft_skillsRepo.findAll();
    }

    @Override
    public Hard_And_Soft_Skills traerUno(long id) {
         return hard_and_soft_skillsRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Hard_And_Soft_Skills h) {        
        hard_and_soft_skillsRepo.save(h);
        return true;
    }

    @Override
    public boolean modificar(Hard_And_Soft_Skills h) {

        hard_and_soft_skillsRepo.save(h);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            hard_and_soft_skillsRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Hard_And_Soft_Skills h) {
        hard_and_soft_skillsRepo.delete(h);
        return false;
    }
}

