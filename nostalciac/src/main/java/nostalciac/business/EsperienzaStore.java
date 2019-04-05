/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import nostalciac.entity.Anagrafica;
import nostalciac.entity.Corso;
import nostalciac.entity.Esperienza;

/**
 *
 * @author tss
 */
@Stateless
public class EsperienzaStore {
    @PersistenceContext
    EntityManager em;
    
    /**
     * *
     * Restituisce tutte le esperienze
     *
     * @return
     */
    public List<Esperienza> all() {
        // Dammi tutti 
        return em.createQuery("select e FROM Esperienza e ORDER BY e.nome ", Esperienza.class)
                .getResultList();
    }
    
    /**
     * per salvare nuovo record su DB
     * 
     * @param esperienza
     * @return 
     */
    public Esperienza create(Esperienza esperienza) {
        return em.merge(esperienza);
    }

    /**
     * *
     * Insert o Update su DB
     *
     * @param esperienza
     * @return
     */
    public Esperienza save(Esperienza esperienza) {
        return em.merge(esperienza);
    }

    
    /**
     * Ritorna il tag con ID passato
     *
     * @param id
     * @return
     */
    public Esperienza find(int id) {
        return em.find(Esperienza.class, id);
    }

    /**
     * Cancella il record passando l'ID
     *
     * @param id
     */
    public void remove(int id) {
        // prima si cerca per ID e poi si cancella
        Esperienza toremove = em.find(Esperienza.class, id);
        em.remove(toremove);
    }

}
