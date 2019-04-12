/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import nostalciac.business.AnagraficaStore;
import nostalciac.entity.Anagrafica;

/**
 *
 * @author tss
 */
@Path("{id}")
public class AnagraficaResource {

    @Inject
    private AnagraficaStore store;
//
    @PathParam("id")
    private Integer id;

    @Context
    ResourceContext rc;

    // Espongo il metodo di ricerca GET 
    // per ID
    // non serve più il path (perchè glielo passa SediResource) @Path("{id}")
    @GET
    public Anagrafica find() {
        return store.find(id);
    }

    // Espongo il metodo di update PUT 
    // aggiorna su DB il record indicato con id
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Anagrafica a) {
        // se id esiste nel DB faccio un aggiornamento
        // altrimenti lo creo nuovo
        a.setId(id);
        store.save(a);
    }

    // Espongo il metodo di update DELETE
    // cancello il record indicato con id
    @DELETE
    public void delete() {
        store.remove(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
