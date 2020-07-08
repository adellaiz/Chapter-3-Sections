/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 22:28:11
 * @modify date 2020-07-08 22:35:12
 * @desc [(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess and
reports whether the guess is correct or incorrect.]
 */

package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coin = (int)(Math.random() * 2);
        int coin2 = (int)(Math.random() * 2);
        System.out.println(coin + " " + coin2);
        System.out.print("Enter a guess = ");
        int guess = input.nextInt();
        if(guess == coin || guess == coin2){
            System.out.println("Congrats you're correct!");
        } if (guess != coin || guess != coin2){
            System.out.println("Sorry you're incorrect");
        }
    }
}