import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        // read n
        int n = scanner.nextInt();

        // read n detectorPrints
        // for each determine larger/smaller/perfect & increment counts
        for (int i = 1; i <= n; i++) {
            int current = scanner.nextInt();
            if (current == 1) {
                larger += 1;
            } else if (current == 0) {
                perfect += 1;
            } else {
                smaller += 1;
            }
        }

        System.out.printf("%d %d %d", perfect, larger, smaller);
    }
}