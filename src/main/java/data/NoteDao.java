package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoteDao {
    private Map<Integer, Note> noter = new HashMap<>();
    private static int nextId = 0;

    public List<Note> getNoter(){
        return new ArrayList<>(noter.values());
    }

    public Note saveNote(Note note){
        int newNo = nextId++;
        note.setId(newNo);
        noter.put(newNo, note);
        return note;
    }

    public boolean deleteNote(Integer id){
        return (noter.remove(id)!=null);
    }


}
