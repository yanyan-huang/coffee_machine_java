import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // read n
        int n = scanner.nextInt();
        // read matrix
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        String output = "YES";
        // for i in range
        for (int i = 0; i < n; i++) {
            // for j in range
            for (int j = 0; j < i; j++) {
                // check if matrix[i][j] != matrix[j][i]: output No
                if (matrix[i][j] != matrix[j][i]) {
                    output = "NO";
                    System.out.println(output);
                    return;
                }
            }

        }
        System.out.println(output);

    }
}