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
import javax.persistence.OneToOne;
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
@Table(name="footer")
public class Footer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String textoFooter;
            
    /*Relaciones*/ 
    @JsonIgnore
    @OneToOne
    private Persona persona;  

    /*Constructores*/
    public Footer(long id, String textoFooter, Persona persona) {
        this.id = id;
        this.textoFooter = textoFooter;
        this.persona = persona;
    }

    public Footer() {
    }
}
