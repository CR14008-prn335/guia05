/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.PostPaso;

/**
 *
 * @author carlos
 */
@Stateless
public class PostPasoFacade extends AbstractFacade<PostPaso> implements PostPasoFacadeLocal {

    @PersistenceContext(unitName = "uesocc.edu.sv.ingenieria.prn335_2017_webProject_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PostPasoFacade() {
        super(PostPaso.class);
    }
    
}
