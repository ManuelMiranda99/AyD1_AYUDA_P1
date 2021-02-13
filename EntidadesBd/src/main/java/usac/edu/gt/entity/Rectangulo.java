/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author juanr
 */
@Entity
public class Rectangulo implements Serializable {
    
    @Id
    private int id;
    private int ancho;
    private int altura;
    private String nombre;

    public Rectangulo(int id) {
        this.id = id;
    }

    public Rectangulo() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getAncho() {
        return ancho;
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", altura=" + altura + ", nombre=" + nombre + '}';
    }
}
