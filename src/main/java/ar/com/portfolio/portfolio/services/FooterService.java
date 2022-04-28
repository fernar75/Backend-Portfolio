/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import ar.com.portfolio.portfolio.models.Footer;
import ar.com.portfolio.portfolio.repositories.IFooterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yo
 */
@Service
public class FooterService implements ICrudService<Footer> {

    @Autowired
    IFooterRepository footerRepo;

    @Override
    public List<Footer> traerTodo() {
        return footerRepo.findAll();
    }

    @Override
    public Footer traerUno(long id) {
         return footerRepo.findById(id).orElse(null);
    }

    @Override
    public boolean crear(Footer f) {        
        footerRepo.save(f);
        return true;
    }

    @Override
    public boolean modificar(Footer f) {

        footerRepo.save(f);
        return true;
    }

    @Override
    public boolean borrar(long id) {
        try {
            footerRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean borrar(Footer f) {
        footerRepo.delete(f);
        return false;
    }
}

