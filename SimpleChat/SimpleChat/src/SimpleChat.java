import java.util.HashMap;
import java.util.Map;

public class SimpleChat {
    private Map<String, String> talk;

    public SimpleChat(){
        this.talk = new HashMap<>();

        talk.put("What is your name?", "MishaChat");
        talk.put("How are you?", "Everything is great.");
        talk.put("Say me a complement.", "You are a good programmer.");
        talk.put("GoodBye.", "Bye bye, my creater.");
        talk.put("Say smth", "Achieve your aim.");
        talk.put("Misha", "you are so kind, handsome and clever! Good luck.");
    }

    public String chat(String key){
        if(talk.containsKey(key)){
            return talk.get(key);
        } else{
            return "I dont know how I can answer on this statment";
        }
    }


}
