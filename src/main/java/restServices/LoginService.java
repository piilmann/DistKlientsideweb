package restServices;

import data.Bruger;
import data.ErrorMessage;
import data.LoginData;
import data.User;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import rmi.Brugeradmin;

@Path("login")

public class LoginService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response doLogin(LoginData loginData) throws NotBoundException, MalformedURLException, RemoteException {
        //Bruger b = Brugerlogin(loginData.getBrugernavn(),loginData.getPassword());
        if (loginData.getBrugernavn().equals("admin") && loginData.getPassword().equals("123456")){
            //Login ok
            return Response.ok().entity(new User("admin","Administrator")).build();
        } else {
            //Login bad
            return Response.status(Response.Status.UNAUTHORIZED).entity(new ErrorMessage("Forkert brugernavn/password (prøv med admin/123456)")).build();

        }
    }
}
