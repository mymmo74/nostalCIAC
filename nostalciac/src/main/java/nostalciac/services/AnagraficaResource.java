/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.services;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import nostalciac.business.AnagraficaStore;
import nostalciac.business.SedeStore;
import nostalciac.entity.Anagrafica;

/**
 *
 * @author tss
 */
@Path("persona")
public class AnagraficaResource {

    @Inject
    AnagraficaStore store;
    
    @Context
    ResourceContext rc;
     
    private Integer id;

   

    // Espongo il metodo di ricerca GET 
    // per ID
    // non serve più il path (perchè glielo passa SediResource) @Path("{id}")
    @GET
    public Anagrafica find() {
        System.out.println("ci sono");
        return null;
    }

    

    public void setId(Integer id) {
        this.id = id;
    }

}
