//import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        boolean output = true;
        Scanner scanner = new Scanner(System.in);
        // read size of the array
        int size = scanner.nextInt();
        // System.out.print("Size: " + size);

        // read elements of the array
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        // System.out.println("Array: " + Arrays.toString(numbers));

        // read n and m;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // System.out.println("n: " + n);
        // System.out.println("m: " + m);

        // enumerate all pairs of subsequent numbers
        for (int i = 0; i < size - 1; i++) {
            // compares with [n, m] or [m, n]
            if (numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n) {
                output = false;
                break;
            }
        }

        System.out.println(output);
    }

}