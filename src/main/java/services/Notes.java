package services;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import data.Note;
import data.NoteDao;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

@Path("notes")
public class Notes {
    private static Map<Integer,Note> noter = new HashMap<>(); //Database mock
    private static int nextid = 0; //Autoincrement
    private static NoteDao noteDao= new NoteDao();

    @GET
    public String getNoter() throws IOException {
        //Initialize Mustache renderer
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache m = mf.compile("notehtml.mustache");
        //Set some data
        HashMap<String, Object> mustacheData = new HashMap<String, Object>();
        mustacheData.put("noter",noteDao.getNotes());
        //render template with data
        StringWriter writer = new StringWriter();
        m.execute(writer, mustacheData).flush();
        return writer.toString();

            //return FileLoader.loadMustache("notehtml.mustache", mustacheData);
    }

    @POST
    public String postNote(@FormParam("note") String note, @FormParam("delete") Integer no) throws IOException {
        if(note!=null) {
            noteDao.saveNote(note);
        }
        if(no!=null){
            noteDao.deleteNote(no);
        }
        return getNoter();
    }



}
