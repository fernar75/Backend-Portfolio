/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Iniciar_Sesion;
import ar.com.portfolio.portfolio.repositories.IIniciar_SesionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class Iniciar_SesionService implements ICrudService<Iniciar_Sesion> {

    @Autowired
    IIniciar_SesionRepository iniciar_sesionRepo;

    @Override
    public List<Iniciar_Sesion> traerTodo() {
        return iniciar_sesionRepo.findAll();
    }

    @Override
    public Iniciar_Sesion traerUno(long id) {
         return iniciar_sesionRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Iniciar_Sesion i) {        
        iniciar_sesionRepo.save(i);
        return true;
    }

    @Override
    public boolean modificar(Iniciar_Sesion i) {

        iniciar_sesionRepo.save(i);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            iniciar_sesionRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Iniciar_Sesion i) {
        iniciar_sesionRepo.delete(i);
        return false;
    }
}

