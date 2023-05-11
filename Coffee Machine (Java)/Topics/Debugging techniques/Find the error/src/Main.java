import java.util.Arrays;
import java.util.Scanner;

class Util {
    public static int[] swapInts(int[] ints) {
        int temp = ints[0];
        ints[0] = ints[1];
        ints[1] = temp;
        return ints;
        // return new int[]{ints[1], ints[0]};
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());
        // System.out.println("Before swapping: " + ints[0]);
        // System.out.println("Before swapping: " + ints[1]);

        Util.swapInts(ints);
        // System.out.println(Arrays.toString(Util.swapInts(ints)));

        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}