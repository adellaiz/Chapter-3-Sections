/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 13:49:27
 * @modify date 2020-07-09 14:06:27
 * @desc [(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer = ");
        int number = input.nextInt();
        boolean isDivisible5 = false;
        boolean isDivisible6 = false;
        if(number % 5 == 0){
            isDivisible5 = true;
        } if (number % 6 == 0){
            isDivisible6 = true;
        }
        System.out.println("Is " + number + " divisible by 5 and 6? " + (isDivisible5 && isDivisible6));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (isDivisible5 || isDivisible6));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (isDivisible5 ^ isDivisible6));
    }
}