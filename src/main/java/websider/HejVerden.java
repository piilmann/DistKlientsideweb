package websider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("hejverden")
public class HejVerden {
    @GET
    public String lavHtml(){
        System.out.println("Hej Verden!");
        System.out.println("Hvornår smager en Tuborg bedst?");
        System.out.println("Hvergang!");
        return "Hej verden! <br/>Hvornår smager en Tuborg bedst?";
    }
}
