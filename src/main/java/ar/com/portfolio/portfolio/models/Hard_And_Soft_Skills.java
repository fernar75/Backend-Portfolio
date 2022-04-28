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
@Table(name="hard_and_soft_skills")
public class Hard_And_Soft_Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String skill;
    private long gradoDominio;
             
    /*Relaciones*/ 
    @JsonIgnore
    @ManyToOne
    private Persona persona; 

    /*Constructores*/
    public Hard_And_Soft_Skills(long id, String skill, long gradoDominio, Persona persona) {
        this.id = id;
        this.skill = skill;
        this.gradoDominio = gradoDominio;
        this.persona = persona;
    }

    public Hard_And_Soft_Skills() {
    }
}
