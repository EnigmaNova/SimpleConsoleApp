import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private List<Note> list;

    public NoteManager(){
        this.list = new ArrayList<>();
    }

    public void addNote(Note note){
        list.add(note);
    }

    public Note findNote(String title){
        for(Note note : list){
            if(note.getTitle().equalsIgnoreCase(title)){
                return note;
            }
        }
        return null;
    }

    public void updateNote(Note note, String text){
        note.setText(text);
    }

    public void deleteNote(String title){
        Note note = findNote(title);
        if(note != null){
            list.remove(note);
        } else{ 
            System.out.println("Note not found.");
        }
    }

    public void displayAllNoteTitles(){
        if(list.isEmpty()){
            System.out.println("You dont have notes.");
        } else{
            for(Note note : list){
                System.out.println("- " + note.getTitle());
            }
        }
    }
}
