/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import nostalciac.business.SedeStore;
import nostalciac.entity.Sede;

/**
 *
 * @author tss
 */
// non deve avere annotazioni Path perchè è una sottorisorsa di SediResource
public class SedeResource {

    private final Integer id;
    private final SedeStore store;

    public SedeResource(Integer id, SedeStore store) {
        this.id = id;
        this.store = store;
    }

    // Espongo il metodo di ricerca GET 
    // per ID
    @GET
    // non serve più il path (perchè glielo passa SediResource) @Path("{id}")
    public Sede find() {
        return store.find(id);
    }

    // Espongo il metodo di update PUT 
    // aggiorna su DB il record indicato con id
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Sede s) {
        // se id esiste nel DB faccio un aggiornamento
        // altrimenti lo creo nuovo
        s.setId(id);
        store.save(s);
    }

    // Espongo il metodo di update DELETE
    // cancello il record indicato con id
    @DELETE
    public void delete() {
        store.remove(id);
    }

}
