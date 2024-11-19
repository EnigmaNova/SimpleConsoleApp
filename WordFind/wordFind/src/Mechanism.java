public class Mechanism {
    //пусть работает с нескольмики частями
    //и пусть работает с частью элемета
    public String findWord(String line, String part){
        String[] arr = line.split(" ");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(part)){
                return "We have this word in this string";
            }
        }
        return "This part not found";
    }
}
