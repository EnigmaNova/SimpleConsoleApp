public class IndexBody {
    private double index = 0;

    public double calculation(double height, int wes){
        double znam = height * height;
        index = wes / znam;
        return index;
    }

}
