import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    Scanner scanner = new Scanner(System.in);
    int age = 0;
    int LOWER_BOUND = 14;
    public void minAge() {
        float minAge = age;
        int realMinAge = Math.round((minAge/2)+7);
    }
    public void maxAge() {
        float maxAge = age;
        int realMaxAge = Math.round(age-7)*2;
    }
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (true) {
            System.out.println("what is your age?");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else {
                    maxAge();
                    minAge();
                    System.out.println("Your dating range is from "+realMinAge+" to "+realMaxAge);
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

