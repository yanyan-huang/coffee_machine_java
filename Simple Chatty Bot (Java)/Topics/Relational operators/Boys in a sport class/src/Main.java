import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        // read inputs
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        // check ascending/non-decreasing
        boolean ascending = h1 <= h2 && h2 <= h3;
        // check descending/non-increasing
        boolean descending = h1 >= h2 && h2 >= h3;
        // print output
        System.out.println(ascending || descending);
    }
}