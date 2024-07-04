import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate the hypotenuse of a triagle");
        System.out.println("Enter the height of the traigle");
        double h = scanner.nextDouble();
        System.out.println("Enter the base of the traigle");
        double b = scanner.nextDouble();


        result= Math.sqrt(Math.pow(h,2)+Math.pow(b,2));

        System.out.println("The hypotenuse of a traigle is: "+result);


    }
}