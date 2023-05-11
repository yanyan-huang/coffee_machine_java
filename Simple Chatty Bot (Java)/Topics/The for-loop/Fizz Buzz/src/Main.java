import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        final int firstDivisor = 3;
        final int secondDivisor = 5;

        // read start, end
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // for each number in range
        for (int number = start; number <= end; number++) {
            // check divisible by 3/5 & print
            if (number % firstDivisor == 0 && number % secondDivisor == 0) {
                System.out.println("FizzBuzz");
            } else if (number % firstDivisor == 0) {
                System.out.println("Fizz");
            } else if (number % secondDivisor == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }

    }
}