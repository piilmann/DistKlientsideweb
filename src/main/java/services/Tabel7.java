package services;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

@Path("7tabel")
public class Tabel7 {
    @Context
    HttpServletRequest request;

    @GET
    public String get7tabel() throws IOException {
       StringBuilder builder = new StringBuilder();
        builder.append("<html>");
        builder.append("<head><title>Syvtabellen - fra en servlet</title></head>");
        builder.append("<body>");
        builder.append("<p>Her er syv-tabellen:<br>");

        for (int i = 1; i <= 10; i++) {
            builder.append("Syv gange " + i + " er: " + 7 * i + ".<br>");
        }
        builder.append("IP: " + request.getRemoteAddr() );
        builder.append("Sprog: " + request.getHeader("Accept-Language") );
        builder.append("</body>");
        builder.append("</html>");



        return builder.toString();
    }
}
