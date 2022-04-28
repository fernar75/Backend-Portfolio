/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Experiencia;
import ar.com.portfolio.portfolio.repositories.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class ExperienciaService implements ICrudService<Experiencia> {

    @Autowired
    IExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> traerTodo() {
        return experienciaRepo.findAll();
    }

    @Override
    public Experiencia traerUno(long id) {
         return experienciaRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Experiencia ex) {        
        experienciaRepo.save(ex);
        return true;
    }

    @Override
    public boolean modificar(Experiencia ex) {

        experienciaRepo.save(ex);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            experienciaRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Experiencia ex) {
        experienciaRepo.delete(ex);
        return false;
    }
}

