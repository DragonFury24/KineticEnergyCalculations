import java.util.InputMismatchException;
import java.util.Scanner;

public class KineticMain {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input the mass of the object in kilograms.");
        double mass = noNegDInput(keyboard);
        System.out.println("Please input the velocity of the object in meters per second.");
        double velocity = dInput(keyboard);
        System.out.println("The kinetic energy of this object is " + .5 * mass * Math.pow(velocity, 2) + " Joules.");
    }

    private static double dInput(Scanner keyboard) { //checks if input is a double. If not, then will give error and force user to retry
        double dOutput = 0;
        boolean noInput = true;
        while (noInput) {
            try {
                dOutput = keyboard.nextDouble();
                noInput = false;
            } catch (InputMismatchException I) {
                System.out.println("You did not input a number. Please try again.");
                keyboard.next();
            }
        }

        return dOutput;
    }

    private static double noNegDInput(Scanner keyboard) { //checks if input is a double. If not, then will give error and force user to retry
        double dOutput = 0;
        boolean noInput = true;
        while (noInput) {
            try {
                dOutput = keyboard.nextDouble();
                noInput = false;

                if (dOutput < 0) { //checks if number is negative and will reset @noInput to force user to retry
                    System.out.println("You put in a number less than 0. Please try again.");
                    noInput = true;
                }
            } catch (InputMismatchException I) {
                System.out.println("You did not input a number. Please try again.");
                keyboard.next();
            }
        }

        return dOutput;
    }
}
