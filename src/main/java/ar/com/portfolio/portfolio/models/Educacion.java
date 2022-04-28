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
@Table(name="educacion")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String estudio;
    private String institucion;
    private Date fechaInicio;
    private Date fechaFin;
    private String localidad;
    private String provincia;
    private String urlLogoInstitucion;

    /*Relaciones*/
    @JsonIgnore
    @ManyToOne
    private Persona persona;  

    /*Constructores*/
    public Educacion(long id, String estudio, String institucion, Date fechaInicio, Date fechaFin, String localidad, String provincia, String urlLogoInstitucion, Persona persona) {
        this.id = id;
        this.estudio = estudio;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.localidad = localidad;
        this.provincia = provincia;
        this.urlLogoInstitucion = urlLogoInstitucion;
        this.persona = persona;
    }      

    public Educacion() {
    }
}
