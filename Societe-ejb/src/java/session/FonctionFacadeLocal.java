/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Fonction;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sara
 */
@Local
public interface FonctionFacadeLocal {

    void create(Fonction fonction);

    void edit(Fonction fonction);

    void remove(Fonction fonction);

    Fonction find(Object id);

    List<Fonction> findAll();

    List<Fonction> findRange(int[] range);

    int count();
     public String fonctionerreur();
    
}
