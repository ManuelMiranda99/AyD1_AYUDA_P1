/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.mgdbean;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import usac.edu.gt.session.local.RectanguloFacadeLocal;

/**
 *
 * @author juanr
 */
@Named
@RequestScoped
public class Figuras {
    
    private String nombreAplicacion;
    
    @EJB
    private RectanguloFacadeLocal rectanguloFacadeLocal;
    
    @PostConstruct
    public void init(){
        nombreAplicacion = "Figuritas";
    }
    
    @PreDestroy
    public void destroy(){
        
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }
    
    
}
