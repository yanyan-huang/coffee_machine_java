import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        // read inputs
        long first = scanner.nextLong();
        String operator = scanner.next();
        long second = scanner.nextLong();

        switch (operator) {
            case "+": {
                System.out.println(first + second);
                break;
            }
            case "-": {
                System.out.println(first - second);
                break;
            }
            case "*": {
                System.out.println(first * second);
                break;
            }
            case "/": {
                try {
                    System.out.println(first / second);
                } catch (ArithmeticException e) {
                    System.out.println("Division by 0!");
                }
                break;
            }
            default: {
                System.out.println("Unknown operator");
            }
        }
    }
}