/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostalciac.services;

import nostalciac.business.CorsoStore;
import nostalciac.business.SedeStore;
import nostalciac.business.TagStore;
import nostalciac.entity.Corso;
import nostalciac.entity.Sede;
import nostalciac.entity.Tag;
import java.net.URI;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author tss
 */
public class CorsiResource {
    
    @Inject
    private  CorsoStore store;
    
    @Inject
    private  SedeStore sedeStore;
    
    @Inject
    private  TagStore tagStore;
    
    private  Integer sedeId;

    

    @GET
    public List<Corso> findAll() {
        return store.findBySede(sedeId);
    }

    @GET
    @Path("{id}")
    public Corso find(@PathParam("id") Integer id) {
        return store.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Corso c, @Context UriInfo uriInfo) {
        Sede sede = sedeStore.find(sedeId);
        c.setSede(sede);
        Corso saved = store.save(c);
        URI uri = uriInfo.getAbsolutePathBuilder()
                .path("/" + saved.getId())
                .build();
        return Response.ok(uri).build();
    }

    @PUT
    @Path("{id}")
    public void update(@PathParam("id") Integer id, Corso c) {
        c.setId(id);
        c.setSede(sedeStore.find(sedeId));
        store.save(c);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Integer id) {
        store.remove(id);
    }
    
    @GET
    @Path("{id}/tags")
    public List<Tag> findTags(@PathParam("id") Integer id){
        return store.findTags(id);
    }
    
    @PUT
    @Path("{id}/tags")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateTags(@PathParam("id") Integer id, List<Integer> idTags){
        Corso finded = store.find(id);
        Set<Tag> tosave = idTags.stream()
                .map(t -> tagStore.find(t))
                .collect(Collectors.toSet());
        finded.setTags(tosave);
        store.save(finded);
    }

    public void setSedeId(Integer sedeId) {
        this.sedeId = sedeId;
    }
    
    
}



//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response create(Corso c, @Context UriInfo uriInfo) {
//        Sede sede= sedeStore.find(sedeId);
//        c.setSede(sede);
//        store.save(c);
//        Corso saved = store.save(c);
//        URI uri = uriInfo
//                .getAbsolutePathBuilder()
//                .path("/" + saved.getId())
//                .build();
////         return Response.ok(uri).build();
//        return Response.ok(uri).build();
//    }
    