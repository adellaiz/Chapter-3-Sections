/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 22:21:31
 * @modify date 2020-07-08 22:25:38
 * @desc [(Palindrome number) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right. Here is a sample
run of this program:]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer = ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a == c){
            System.out.println(a + "" + b + "" + c + " is a palindrome");
        } else {
            System.out.println(a + "" + b + "" + c + " is not a palindrome");
        }
    }
}