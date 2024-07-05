import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row=0;
        int col=0;
        String symbol= "";

        while (row<=0){
            System.out.println("enter the number of row");
            row = scanner.nextInt();
        }
        while (col<=0) {
            System.out.println("enter the number of column");
            col = scanner.nextInt();
        }
        while (symbol.isBlank() || symbol.length()>1) {
            System.out.println("enter the a symbol");
            symbol = scanner.next();
        }


            for ( int i= 1; i<=row; i++)
            {
                for ( int j = 1;j <= col; j++)
                {
                    if (i==1 || i == row || j==1|| j == col ) {
                        System.out.print(symbol);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println("happy new year");
        }
    }