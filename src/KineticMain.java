import java.util.InputMismatchException;
import java.util.Scanner;

public class KineticMain {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input the mass of the object.");
        double mass = doubleInput(keyboard);
        System.out.println("Please input the velocity of the object.");
        double velocity = doubleInput(keyboard);
        System.out.println("The kinetic energy of this object is " + .5 * mass * Math.pow(velocity, 2) + " Joules.");
    }

    public static double doubleInput(Scanner keyboard) { //checks if input is a double. If not, then will give error and force user to retry
        double dInput = -1;

        while (dInput == -1) {
            try {
                dInput = keyboard.nextDouble();

                if (dInput < 0) {
                    dInput = -1;
                    System.out.println("You put in a number less than 0. Please try again.");
                }
            } catch (InputMismatchException I) {
                System.out.println("You did not input a number. Please try again.");
                keyboard.next();
            }
        }

        return dInput;
    }
}
