import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i =0 ;
        String word;
        while (i < 4) {
            word = scanner.next();
            System.out.println(word);
            i++;
//            if (!word.isEmpty()) {
//                System.out.println( i + " " + word);
//                i++;
//            }
        }

    }
}