/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 10:26:28
 * @modify date 2020-07-10 10:35:50
 * @desc [(Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB = ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa = ");
        int convert = input.nextInt();
        switch (convert) {
            case 0: 
                System.out.print("Enter the dollar amount = ");
                double dollar = input.nextDouble();
                double yuan = dollar * rate;
                System.out.print("$" + dollar + " is " + yuan + " yuan" );break;
            case 1:
                System.out.print("Enter the RMB amount = ");
                yuan = input.nextDouble();
                dollar = yuan / rate;
                System.out.print(yuan + " yuan is " + "$" + dollar);break;
            default: System.out.println("Incorrect input");break;
        }
    }
}