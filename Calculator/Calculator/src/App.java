public class App {

    private Calculator calc;
    private UserInput ui;

    App(){
        this.calc = new Calculator();
        this.ui = new UserInput();
    }


    public void run(){
        try{
            double a = ui.getOperand();
            String op = ui.getOperator();
            double b = ui.getOperand();

            double res = 0;
            switch (op) {
                case "+":
                    res = calc.add(a, b);
                    break;
            
                case "-":
                    res = calc.subtruct(a, b);
                    break;
                
                case "*":
                    res = calc.multy(a, b);
                    break;
                
                case "/":
                    res = calc.divide(a, b);
                    break;    
                default:
                    break;
            }
            printResult(res);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public void printResult(double result){
        System.out.println("the result of our calculation is " + result);
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
