import java.util.Scanner;

import static java.lang.Math.*;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
            return f1(x);
        } else if (0 < x && x < 1) {
            return f2(x);
        } else {
            return f3(x);
        }
    }

    //implement your methods here
    public static double f1(double x) {
        return pow(x, 2) + 1;
    }

    public static double f2(double x) {
        return 1 / pow(x, 2);
    }

    public static double f3(double x) {
        return pow(x, 2) - 1;
    }
}