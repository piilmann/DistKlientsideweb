package websider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("hejverden2")
public class HejVerden2 {
    @GET
    public String lavHtml(@QueryParam("svar") String svar) {
      System.out.println("svaret i HejVerden2 blev angivet til '"+svar+"'");
      if (svar==null) {
        return "Hej verden! <br/>Hvornår smager en Tuborg bedst?<br/>"
                + "<form><input type='text' name='svar'></form>";
      }
      if (svar.toLowerCase().startsWith("hvergang")) {
        return "Helt rigtigt!";
      }
      return "Beklager, '" + svar+"' er ikke korrekt.";
    }
}
