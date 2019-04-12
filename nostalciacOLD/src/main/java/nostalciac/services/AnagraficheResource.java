/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.services;

import java.net.URI;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import nostalciac.business.AnagraficaStore;
import nostalciac.entity.Anagrafica;

/**
 *
 * @author tss
 */
@Path("/anagrafiche")
public class AnagraficheResource {
    
    @Inject
    AnagraficaStore store;
    
    @Context
    ResourceContext rc;
    
    @GET
    public List<Anagrafica> findAll() {
        return store.all();
    }
    
    
    @Path("{id}")
    public AnagraficaResource find(){
        return rc.getResource(AnagraficaResource.class);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Anagrafica anagrafica, @Context UriInfo uriInfo) {
        
        Anagrafica saved = store.create(anagrafica);
        // gli vogliamo restituire il percorso della risorsa esposta
        // del tipo "/resources/tags/25"
        URI uri=uriInfo
                .getAbsolutePathBuilder()
                .path("/"+saved.getId())
                .build();
        
        return Response.ok(uri).build();
         
    }

    
    
    
    
    
   
}
