import java.util.Random;
public class RandomNumber {
    private Random random;

    public RandomNumber(){
        this.random = new Random();
    }
    public int rand(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
