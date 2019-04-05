/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.business;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import nostalciac.entity.Anagrafica;

/**
 *
 * @author tss
 */
@Stateless
public class AnagraficaStore implements Serializable{
    
  
    
        
    /**
     * *
     * Restituisce tutte le anagrafiche
     *
     * @return
     */
    public List<Anagrafica> all() {
        return null;
    }
    
    /**
     * per salvare nuovo record su DB
     * 
     * @param anagrafica
     * @return 
     */
    public Anagrafica create(Anagrafica anagrafica) {
        return null;
    }

    /**
     * *
     * Insert o Update su DB
     *
     * @param anagrafica
     * @return
     */
    public Anagrafica save(Anagrafica anagrafica) {
        return null;
    }

    
    /**
     * Ritorna il tag con ID passato
     *
     * @param id
     * @return
     */
    public Anagrafica find(int id) {
        return null;
    }

    /**
     * Cancella il record passando l'ID
     *
     * @param id
     */
    public void remove(int id) {
        
    }

}
