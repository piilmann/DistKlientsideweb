package restServices;

import data.Note;
import data.NoteDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("noter")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NoteService {
    private static NoteDao noteDao = new NoteDao();

    @GET
    public List<Note> getNoter(){
        return noteDao.getNoter();
    }

    @POST
    public List<Note> postNote(Note note){
        if(note!=null) {
            noteDao.saveNote(note);
        }
        return getNoter();
    }

    @DELETE
    @Path("{id}")
    public List<Note> deleteNote(@PathParam("id") int noteID){
        noteDao.deleteNote(noteID);
        return getNoter();

    }
}
