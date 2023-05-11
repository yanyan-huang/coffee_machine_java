import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String name = scanner.next();
        int yearOfExperience = scanner.nextInt();
        String cuisinePreference = scanner.next();

//        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef " +
//                "who cooks " + cuisinePreference + " dishes and has " + yearOfExperience + " years of experience.");
        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks %s dishes " +
                "and has %d years of experience.", name, cuisinePreference, yearOfExperience);
    }
}