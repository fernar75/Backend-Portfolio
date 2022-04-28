/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Educacion;
import ar.com.portfolio.portfolio.repositories.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class EducacionService implements ICrudService<Educacion> {

    @Autowired
    IEducacionRepository educacionRepo;

    @Override
    public List<Educacion> traerTodo() {
        return educacionRepo.findAll();
    }

    @Override
    public Educacion traerUno(long id) {
         return educacionRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Educacion ed) {        
        educacionRepo.save(ed);
        return true;
    }

    @Override
    public boolean modificar(Educacion ed) {

        educacionRepo.save(ed);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            educacionRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Educacion ed) {
        educacionRepo.delete(ed);
        return false;
    }
}
