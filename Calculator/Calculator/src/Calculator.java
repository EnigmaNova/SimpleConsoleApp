public class Calculator {
    public double add(double a, double b){
        return a + b;
    }

    public double subtruct(double a, double b){
        return a - b;
    }

    public double multy(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        if(b == 0){
            throw new ArithmeticException("we cannot divide on zero, sorry");
        }
        return a / b;
    }
}
