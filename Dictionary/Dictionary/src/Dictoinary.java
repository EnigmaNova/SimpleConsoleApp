import java.util.HashMap;
import java.util.Map;

public class Dictoinary {
    Map<String, String> map;

    public Dictoinary(){
        this.map = new HashMap<>();
    }

    public void addWord(String key, String value){
        map.put(key, value);
        System.out.println("your word and definition were saved");
    }
    public void findWord(String key){
        if(map.containsKey(key)){
            System.out.println( map.get(key));
        } else{
            System.out.println( "Dont found this word");
        }
    }

    public void updateWord(String key, String newValue){
        if(map.containsKey(key)){
            map.put(key, newValue);
            System.out.println("word updated sucsessfully");
        } else{
            System.out.println("we dont have this word to update");
        }
    }

    public void deleteWord(String key){
        if(map.containsKey(key)){
            map.remove(key);
            System.out.println("mission completed");
        } else{
            System.out.println("we dont have this word in our base");
        }
    }

    public void dispayAll(){
        if(map.isEmpty()){
            System.out.println("dictionary is empty");
        } else{
            System.out.println("dictionary contents:");
            map.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }
}
