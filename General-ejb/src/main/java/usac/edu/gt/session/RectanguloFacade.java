/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import usac.edu.gt.entity.Rectangulo;
import usac.edu.gt.session.local.RectanguloFacadeLocal;

/**
 *
 * @author martin
 */
@Stateless
public class RectanguloFacade  extends AbstractFacade<Rectangulo> 
        implements RectanguloFacadeLocal {
    
    @PersistenceContext(unitName = "BD_PU")
     private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Resource
    private EJBContext ejbContext;

    public RectanguloFacade() {
        super(Rectangulo.class);
    }

    @Override
    public void metodo1() {
        //LOGICA
    }

    @Override
    public String metodo2() {
        String mensaje = "";
        //LOGICA
        return mensaje;
    }

    @Override
    public double obtenerArea(Rectangulo rectangulo) {
        double area = 2.0;
        //LOGICA
        return area;
    }

    @Override
    public double obtenerPerimetro(Rectangulo rectangulo) {
        double perimetro = 1.0;
        //LOGICA
        return perimetro;
    }

    @Override
    public Rectangulo combiarRectangulos(Rectangulo rec1, Rectangulo rec2) {
         Rectangulo rectangulo = new Rectangulo();
        //LOGICA
        return rectangulo;
    }

    @Override
    public void insertar(Rectangulo rectangulo) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
         userTransaction.begin();
        this.create(rectangulo);
        userTransaction.commit(); 

    }
}
