/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Societe;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Sara
 */
@Stateless
@LocalBean
public class SocieteFacade extends AbstractFacade<Societe> implements SocieteFacadeLocal {
    @PersistenceContext(unitName = "Societe-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SocieteFacade() {
        super(Societe.class);
    }
    
}
