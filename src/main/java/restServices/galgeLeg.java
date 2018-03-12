/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restServices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author christofferpiilmann
 */
@Path("galgeleg")
@Produces(MediaType.APPLICATION_JSON)

public class galgeLeg {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response guessLetterPost(String input) throws IOException {

        if(input == "A"){
           return Response.ok().build(); 
        } else {
           return Response.status(Response.Status.FORBIDDEN).build();
        }
  
    }
}
