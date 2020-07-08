/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 22:35:40
 * @modify date 2020-07-08 22:48:55
 * @desc [(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
$10,000.
2. If all digits in the user input match all digits in the lottery number, the award is
$3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is
$1,000.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lottery = (int)(Math.random() * 100);
        System.out.print("Enter you lottery pick (three digits) = ");
        int guess = input.nextInt();
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        int lotteryDigit3 = lottery % 10;
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        int guessDigit3 = guess % 10;
        System.out.println("The lottery number is = " + lottery);
        if(guess == lottery){
            System.out.println("Exact match you win $10,000");
        } else if (guessDigit1 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3){
            System.out.println("Match all digits you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 
        || guessDigit1 == lotteryDigit2 
        || guessDigit1 == lotteryDigit3
        || guessDigit2 == lotteryDigit1 
        || guessDigit2 == lotteryDigit2 
        || guessDigit2 == lotteryDigit3
        || guessDigit3 == lotteryDigit1 
        || guessDigit3 == lotteryDigit2
        || guessDigit3 == lotteryDigit3){
            System.out.println("Match one digit you win $1,000");
        } else {
            System.out.println("Sorry not match");
        }
    }
}