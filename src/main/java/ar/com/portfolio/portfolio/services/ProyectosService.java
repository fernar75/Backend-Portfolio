/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Proyectos;
import ar.com.portfolio.portfolio.repositories.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class ProyectosService implements ICrudService<Proyectos> {

    @Autowired
    IProyectosRepository proyectosRepo;

    @Override
    public List<Proyectos> traerTodo() {
        return proyectosRepo.findAll();
    }

    @Override
    public Proyectos traerUno(long id) {
         return proyectosRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Proyectos pr) {        
        proyectosRepo.save(pr);
        return true;
    }

    @Override
    public boolean modificar(Proyectos pr) {

        proyectosRepo.save(pr);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            proyectosRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Proyectos pr) {
        proyectosRepo.delete(pr);
        return false;
    }
}

