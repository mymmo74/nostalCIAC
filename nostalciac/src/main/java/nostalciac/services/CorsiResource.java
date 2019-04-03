/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.services;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import nostalciac.business.CorsoStore;
import nostalciac.business.SedeStore;
import nostalciac.entity.Corso;
import nostalciac.entity.Sede;

/**
 *
 * @author tss
 */
public class CorsiResource {
    private final CorsoStore store;
    private final SedeStore sedeStore;

    private final Integer sedeId;
    
    public CorsiResource(CorsoStore store, SedeStore sedeStore, Integer sedeId) {
        this.store = store;
        this.sedeStore = sedeStore;
        this.sedeId = sedeId;
    }
    
    @GET
    public List<Corso> findAll() {
        return store.findBySede(sedeId);
    }

    @GET
    @Path("{id}")
    // "./resources/tags/2 "   <--- esempio
    public Corso find(@PathParam("id") Integer id) {
        return store.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Corso c) {
        Sede sede= sedeStore.find(sedeId);
        c.setSede(sede);
        store.save(c);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public void update(@PathParam("id") int id, Corso c) {
        // se id esiste nel DB faccio un aggiornamento
        // altrimenti lo creo nuovo
        c.setId(id);
        store.save(c);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") int id) {
        store.remove(id);
    }
}
