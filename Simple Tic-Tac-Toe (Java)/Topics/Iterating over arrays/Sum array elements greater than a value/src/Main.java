import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // read size
        int size =  scanner.nextInt();

        // read the array of numbers
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // read n
        int n = scanner.nextInt();
        int sum = 0;
        // for each num in numbers
        for (int num: numbers) {
            // add to sum only when num > n
            if (num > n) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}