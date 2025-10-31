public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.doOperation(new Addition(),10,5));
        System.out.println(calculator.doOperation(new Subtraction(),10,5));
        System.out.println(calculator.doOperation(new Multiplication(),10,5));
    }


}
