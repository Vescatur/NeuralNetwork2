package nl.edmi.NeuralNetwork;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ivan on 12-3-2017.
 */
public class Communication {
    public static final Scanner Scannner = new Scanner(System.in);

    public static int GetNextInt(){
        int input;
        while (true) {
            try {
                input = Scannner .nextInt();
                break;
            } catch (InputMismatchException ae) {
                Scannner .next();
                System.out.println("Please input a number");
            }
        }
        return input;
    }
}
