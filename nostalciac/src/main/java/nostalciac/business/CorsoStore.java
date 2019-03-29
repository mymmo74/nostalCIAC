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
import nostalciac.entity.Corso;

/**
 *
 * @author tss
 */
@Stateless
public class CorsoStore {
    
    @PersistenceContext
    EntityManager em;
    
    public Corso find (Integer id){
        return em.find(Corso.class, id);
    }
    
    public Corso save (Corso c){
        return em.merge(c);
    }
    
    public void remove (Integer id){
        em.remove(id);
    }
    
    public List<Corso> findAll (){
        return em.createQuery("select e from Corso e order by e.nome", Corso.class)
                .getResultList();
    }
    
    
}
