/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 18:29:42
 * @modify date 2020-07-08 19:33:09
 * @desc [(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order. (Bubble sort with if)]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 number = ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp = 0;
        //ex = 3 2 1
        //     2 3 1
        //     2 1 3
        //     1 2 3
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        } if (b > c){
            temp = b;
            b = c;
            c = temp;
        } if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Your number after being sorting are = " + a + " " +  b + " " + c);
    }
}