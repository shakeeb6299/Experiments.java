import java.util.Scanner;
    import java.util.Scanner;

public class SellBuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many vegetables do you want to buy? ");
        int cveg = sc.nextInt();

        int id[] = new int[cveg];
        int quantity[] = new int[cveg];
        String des[] = new String[cveg];
        float cost[] = new float[cveg];
        float total = 0;

        for (int i = 0; i < cveg; i++) {
            System.out.println("\nEnter details for vegetable " + (i + 1) + ":");

            System.out.print("ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();  // consume leftover newline

            System.out.print("Description: ");
            des[i] = sc.nextLine();

            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();

            System.out.print("Cost per unit: ");
            cost[i] = sc.nextFloat();

            total += cost[i] * quantity[i];
        }

        System.out.println("\n Purchase Summary");
        for (int i = 0; i < cveg; i++) {
            System.out.println("ID: " + id[i] + ", Name: " + des[i] + 
                               ", Quantity: " + quantity[i] + 
                               ", Cost per unit: " + cost[i] + 
                               ", Subtotal: " + (cost[i] * quantity[i]));
        }

        System.out.println("\nTotal cost: " + total);

        sc.close();
    }
}
