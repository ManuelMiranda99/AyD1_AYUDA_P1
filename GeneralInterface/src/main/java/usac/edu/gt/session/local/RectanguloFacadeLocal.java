/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session.local;

import javax.ejb.Local;
import usac.edu.gt.entity.Rectangulo;

/**
 *
 * @author juanr
 */
@Local
public interface RectanguloFacadeLocal {
    
    Rectangulo find(Object id);
    
    void create(Rectangulo rectangulo);

    void edit(Rectangulo rectangulo);

    void remove(Rectangulo rectangulo);
    
    public void metodo1();
    
    public String metodo2();
    
    public double obtenerArea(Rectangulo rectangulo);
    
    public double obtenerPerimetro(Rectangulo rectangulo);
    
    public Rectangulo combiarRectangulos(Rectangulo rec1, Rectangulo rec2);
    
    public void insertar(Rectangulo rectangulo) throws Exception;
    
}
