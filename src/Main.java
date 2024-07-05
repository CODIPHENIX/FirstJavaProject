import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your age");
        int age = scanner.nextInt();

        if(age>=75){
            System.out.println("you are a boommer");
        }else if(age>=18){
            System.out.println("you are an adult");
        } else if (age>=13) {
            System.out.println("your are a teeneger");
        } else {
            System.out.println("You a still a child");
        }
    }
}