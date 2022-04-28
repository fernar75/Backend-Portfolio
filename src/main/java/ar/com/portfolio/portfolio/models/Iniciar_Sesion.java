/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yo
 */
@Getter
@Setter
@Entity
@Table(name="iniciar_sesion")
public class Iniciar_Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String usuario;
    private String contrasena;
            
    /*Relaciones*/ 
    @JsonIgnore
    @ManyToOne
    private Persona persona; 

    /*Constructores*/
    public Iniciar_Sesion(long id, String usuario, String contrasena, Persona persona) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.persona = persona;
    }

    public Iniciar_Sesion() {
    }
}
