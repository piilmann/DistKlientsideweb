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

        String subinput = input.substring(1,input.length()-1);
        System.out.println(subinput);
        if(subinput == "A"){
           System.out.println("Accepted 202");
           return Response.status(Response.Status.ACCEPTED).build();
        } else {
            System.out.println("BAD REQUEST 400");
           return Response.status(Response.Status.BAD_REQUEST).build();
        }
  
    }
}
