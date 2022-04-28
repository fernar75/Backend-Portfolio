/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Persona;
import ar.com.portfolio.portfolio.repositories.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class PersonaService implements ICrudService<Persona> {

    @Autowired
    IPersonaRepository personaRepo;

    @Override
    public List<Persona> traerTodo() {
        return personaRepo.findAll();
    }

    @Override
    public Persona traerUno(long id) {
        return personaRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Persona p) {
        personaRepo.save(p);

        return true;
    }

    @Override
    public boolean modificar(Persona p) {

        personaRepo.save(p);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            personaRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Persona p) {
        personaRepo.delete(p);
        return false;
    }
}
