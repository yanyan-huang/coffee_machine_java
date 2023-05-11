import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int number;
        while (scanner.hasNext()) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}