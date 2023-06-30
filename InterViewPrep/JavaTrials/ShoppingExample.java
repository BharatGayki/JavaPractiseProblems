import java.util.Scanner;

public class ShoppingExample {
    public static void main(String[] args) {
        int money;
        boolean isHungry;
        boolean hasEaten = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of money you have: ");
        money = scanner.nextInt();

        System.out.print("Are you hungry? (true/false): ");
        isHungry = scanner.nextBoolean();

        // Perform shopping until the person's hunger is satisfied
        do {
            if (isHungry) {
                System.out.println("Going to the grocery shop...");
                money -= buyGroceries(money);
                hasEaten = true;
            } else {
                System.out.println("Going to the beer shop...");
                money -= buyBeer(money);
            }

            // Check if the person is still hungry after shopping
            if (hasEaten) {
                System.out.println("You are no longer hungry. Stomach is full!");
                break;
            }

            System.out.print("Are you still hungry? (true/false): ");
            isHungry = scanner.nextBoolean();

        } while (money > 0);

        System.out.println("Out of money or no longer hungry. Exiting the loop.");
    }

    private static int buyGroceries(int money) {
        int groceryCost = 30; // Cost of groceries

        if (money >= groceryCost) {
            System.out.println("Bought groceries for $" + groceryCost);
            return groceryCost;
        } else {
            System.out.println("Not enough money to buy groceries.");
            return 0;
        }
    }

    private static int buyBeer(int money) {
        int beerCost = 20; // Cost of beer

        if (money >= beerCost) {
            System.out.println("Bought beer for $" + beerCost);
            return beerCost;
        } else {
            System.out.println("Not enough money to buy beer.");
            return 0;
        }
    }
}