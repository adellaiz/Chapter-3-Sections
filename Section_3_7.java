/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 17:26:59
 * @modify date 2020-07-08 18:28:09
 * @desc [(Financial application: monetary units) Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56 \t= ");
            double amount = input.nextDouble();
            int remainingAmount = (int)(amount * 100);
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;
            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;
            int numberOfPennies = remainingAmount;
            String display = "Your amount " + amount + " consists of = \n";
            if(numberOfOneDollars != 0)
                display = display + numberOfOneDollars + " dollars";
            if(numberOfQuarters != 0)
                display = display + "\n" + numberOfQuarters + " quarters";
            if(numberOfDimes != 0)
                display = display + "\n" + numberOfDimes + " dimes";
            if(numberOfNickels !=0)
                display = display + "\n" + numberOfNickels + " nickels";
            if(numberOfPennies != 0)
                display = display + "\n" + numberOfPennies + " pennies";
            System.out.println(display);
    }
}