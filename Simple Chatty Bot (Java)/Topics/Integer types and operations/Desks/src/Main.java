import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        System.out.println((firstGroup + 1) / 2 + (secondGroup + 1) / 2 + (thirdGroup + 1) / 2);
    }
}