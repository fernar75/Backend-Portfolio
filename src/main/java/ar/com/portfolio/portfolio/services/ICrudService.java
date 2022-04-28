/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.portfolio.portfolio.services;

import java.util.List;

/**
 *
 * @author Yo
 */
public interface ICrudService<T> {
    public List<T> traerTodo();
    public T traerUno(long id);
    public boolean crear(T entity);
    public boolean modificar(T entity);
    public boolean borrar(long id);
    public boolean borrar(T entity);    
}
