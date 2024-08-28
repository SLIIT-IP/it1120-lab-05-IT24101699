import java.util.Scanner;

public class IT24101699Lab5Q3 {

    public static final double roomChargePerDay = 48000.0;
    public static final int discountFor10Days = 10;
    public static final int discountFor20Days = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return; 
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End Date");
            return; // Exit the program if validation fails
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0.0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = discountFor10Days;
        } else if (daysReserved >= 5) {
            discountRate = discountFor20Days;
        }

        double totalAmount = roomChargePerDay * daysReserved;
        totalAmount -= totalAmount * (discountRate / 100);

        System.out.println("Room Charge Per Day: Rs. " + roomChargePerDay);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
