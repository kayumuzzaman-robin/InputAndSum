package learn.java;

import java.util.Scanner;

/**
 * Input & Sum.
 * If input is not an integer, it will ask for inter input again.
 * It will add upto the given counter.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;

        System.out.println("Give the limit of the counter (must be a positive value): ");
        int countUpTo = scanner.nextInt();

        while (true) {
            System.out.println("Input " + (count + 1) + " no number to add: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                sum += scanner.nextInt();
                count++;
                if (count == countUpTo) {
                    break;
                }
            } else {
                System.out.println("Wrong input, give a number!");
            }
            scanner.nextLine();
        }
        System.out.println("sum is: " + sum + " & count is: " + count);
    }
}
