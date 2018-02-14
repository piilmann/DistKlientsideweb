package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("hello")
public class Hello {
    @GET
    public String sayHi(@QueryParam("name") String name){
        return "Hi, " + name;
    }
}
