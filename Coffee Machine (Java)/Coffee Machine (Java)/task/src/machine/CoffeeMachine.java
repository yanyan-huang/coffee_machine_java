package machine;

import java.util.Map;
import java.util.Scanner;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    private static final int ESPRESSO_WATER_PER_CUP = 250;
    private static final int ESPRESSO_MILK_PER_CUP = 0;
    private static final int ESPRESSO_BEANS_PER_CUP = 16;
    private static final int ESPRESSO_COST_PER_CUP = 4;
    private static final int LATTE_WATER_PER_CUP = 350;
    private static final int LATTE_MILK_PER_CUP = 75;
    private static final int LATTE_BEANS_PER_CUP = 20;
    private static final int LATTE_COST_PER_CUP = 7;
    private static final int CAPPUCCINO_WATER_PER_CUP = 200;
    private static final int CAPPUCCINO_MILK_PER_CUP = 100;
    private static final int CAPPUCCINO_BEANS_PER_CUP = 12;
    private static final int CAPPUCCINO_COST_PER_CUP = 6;

    // is constructor needed?
    public CoffeeMachine() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        // read input from user: buy, fill, take
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    machine.buyCoffee();
                    break;

                case "fill":
                    machine.fill();
                    break;

                case "take":
                    machine.takeMoneyOut();
                    break;

                case "remaining":
                    machine.printState();
                    break;

                case "exit":
                    return;

                default:
                    System.out.println("Unexpected value: " + action);
            }
        }






//        ingredientCalculator();
//        numberOfServings();

//        System.out.println("Write how many cups of coffee you will need:");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.printf("For %d cups of coffee you will need:\n" +
//                "%d ml of water\n" +
//                "%d ml of milk\n" +
//                "%d g of coffee beans",
//                number, number * 200, number * 50, number * 15);


//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
    }

    private void takeMoneyOut() {
        System.out.printf("I gave you $%d\n", this.money);
        this.money = 0;
    }

    private void fill() {
        System.out.println("\nWrite how many ml of water you want to add:");
        Scanner scanner = new Scanner(System.in);
        this.water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        this.milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.beans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        this.cups += scanner.nextInt();
    }

    private void buyCoffee() {
        // read input for coffee type
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        Scanner scanner = new Scanner(System.in);
        String buyOption = scanner.nextLine();
        switch (buyOption) {
            case "back": return;
            case "1":
                makeCoffee(ESPRESSO_WATER_PER_CUP, ESPRESSO_MILK_PER_CUP, ESPRESSO_BEANS_PER_CUP, ESPRESSO_COST_PER_CUP);
                break;
            case "2":
                makeCoffee(LATTE_WATER_PER_CUP, LATTE_MILK_PER_CUP, LATTE_BEANS_PER_CUP, LATTE_COST_PER_CUP);
                break;
            case "3":
                makeCoffee(CAPPUCCINO_WATER_PER_CUP, CAPPUCCINO_MILK_PER_CUP, CAPPUCCINO_BEANS_PER_CUP, CAPPUCCINO_COST_PER_CUP);
                break;
            default:
                System.out.println("Unexpected value: " + buyOption);
        }
    }


    private void makeCoffee(int waterNeeded, int milkNeeded, int beansNeeded, int cost) {
        boolean enoughResources = true;
        if (this.water < waterNeeded) {
            System.out.println("Sorry, not enough water!");
            enoughResources = false;
        }
        if (this.milk < milkNeeded) {
            System.out.println("Sorry, not enough milk!");
            enoughResources = false;
        }
        if (this.beans < beansNeeded) {
            System.out.println("Sorry, not enough beans!");
            enoughResources = false;
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
            enoughResources = false;
        }

        if (enoughResources) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= waterNeeded;
            this.milk -= milkNeeded;
            this.beans -= beansNeeded;
            this.cups--;
            this.money += cost;
        }

    }

    private void printState() {
        System.out.printf("\nThe coffee machine has:\n" +
                        "%d ml of water\n" +
                        "%d ml of milk\n" +
                        "%d g of coffee beans\n" +
                        "%d disposable cups\n" +
                        "$%d of money\n",
                this.water, this.milk, this.beans, this.cups, this.money);
    }


    private static void ingredientCalculator() {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need:\n" +
                        "%d ml of water\n" +
                        "%d ml of milk\n" +
                        "%d g of coffee beans",
                number, number * 200, number * 50, number * 15);
    }

    private static void numberOfServings() {
        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner scanner = new Scanner(System.in);
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();

        int cupsAvailable = Math.min(water / 200, Math.min(milk / 50, beans / 15));

        if (cupsNeeded == cupsAvailable) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsNeeded < cupsAvailable) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", cupsAvailable - cupsNeeded);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", cupsAvailable);
        }
    }
}
