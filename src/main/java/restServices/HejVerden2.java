package restServices;

import data.ErrorMessage;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("hejverden2")
public class HejVerden2 {

    @POST
    public Response checkAnswer(String svar) {
        System.out.println("svaret i Hej Verden2 blev angivet til '" + svar + "'");
        if (svar.toLowerCase().startsWith("hvergang")) {
            return Response.ok().entity("Helt rigtigt!").build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorMessage("Beklager, '" + svar + "' er ikke korrekt."))
                    .build();
        }
    }
}