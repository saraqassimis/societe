/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Fonction;
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
public class FonctionFacade extends AbstractFacade<Fonction> implements FonctionFacadeLocal {
    @PersistenceContext(unitName = "Societe-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FonctionFacade() {
        super(Fonction.class);
    }
    /**
     *
     * @return
     */
    @Override
    public String fonctionerreur(){
        return"erreur par ajax ";
    }
    
}
