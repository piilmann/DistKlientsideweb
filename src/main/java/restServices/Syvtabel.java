package restServices;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("7tabel")
public class Syvtabel {

    @Context
    HttpServletRequest request;

    @GET
    public List<Integer> get7tabel() throws IOException {
        List<Integer> tabel = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            tabel.add(i*7);
        }

        return tabel;
    }
}
