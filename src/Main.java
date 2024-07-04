import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(10)+1;
        boolean b= random.nextBoolean();
        System.out.println(x);
        System.out.println("Does he love me "+b);

    }
}