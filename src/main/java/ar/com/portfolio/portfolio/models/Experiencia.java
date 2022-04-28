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
@Table(name="experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String empleo;
    private String empresa;
    private Date fechaInicio;
    private Date fechaFin;
    private String tipoJornada;
    private String actividadesRealizadas;
    private String localidad;
    private String provincia;
    private String urlLogoEmpresa;
            
    /*Relaciones*/ 
    @JsonIgnore 
    @ManyToOne
    private Persona persona;  

    /*Constructores*/
    public Experiencia(long id, String empleo, String empresa, Date fechaInicio, Date fechaFin, String tipoJornada, String actividadesRealizadas, String localidad, String provincia, String urlLogoEmpresa, Persona persona) {
        this.id = id;
        this.empleo = empleo;
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoJornada = tipoJornada;
        this.actividadesRealizadas = actividadesRealizadas;
        this.localidad = localidad;
        this.provincia = provincia;
        this.urlLogoEmpresa = urlLogoEmpresa;
        this.persona = persona;
    }

    public Experiencia() {
    }   
}
