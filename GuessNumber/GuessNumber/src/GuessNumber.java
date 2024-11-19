public class GuessNumber {
    int randomNumber = 0;
    public GuessNumber(){}

    public int generate(){
        return randomNumber = (int)(Math.random() * 100);
    }

    public String response(int guess, boolean running){
        if(guess == randomNumber){
            running = false;
            return "My congratilation! You right!";
        } else if(guess < randomNumber){
            return "Little.";
        } else{
            return "Big.";
        }
    }
}
