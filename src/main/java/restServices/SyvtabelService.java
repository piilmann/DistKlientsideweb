package restServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("7tabel")
@Produces(MediaType.APPLICATION_JSON)
public class SyvtabelService {

    @GET
    public List<Integer> get7tabel() throws IOException {
        List<Integer> tabel = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            tabel.add(i*7);
        }

        return tabel;
    }
}
