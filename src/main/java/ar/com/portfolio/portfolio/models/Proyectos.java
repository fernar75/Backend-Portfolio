/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfolio.portfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
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
@Table(name="proyectos")
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String proyecto;
    private Date fechaRealizacion;
    private String descripcion;
    private String urlProyecto;
    private String urlImagenProyecto;
           
    /*Relaciones*/ 
    @JsonIgnore
    @ManyToOne
    private Persona persona; 

    /*Constructores*/
    public Proyectos(long id, String proyecto, Date fechaRealizacion, String descripcion, String urlProyecto, String urlImagenProyecto, Persona persona) {
        this.id = id;
        this.proyecto = proyecto;
        this.fechaRealizacion = fechaRealizacion;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
        this.urlImagenProyecto = urlImagenProyecto;
        this.persona = persona;
    }

    public Proyectos() {
    }
}
