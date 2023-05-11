import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long m = scanner.nextLong();
        int n = 1;
        long factorial = 1;
        while (factorial <= m) {
            n++;
            factorial *= n;
        }
        System.out.println(n);
    }
}