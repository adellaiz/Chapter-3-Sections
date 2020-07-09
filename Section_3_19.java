/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 11:31:25
 * @modify date 2020-07-09 12:16:55
 * @desc [(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a,b,c = ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int sum1 = a+b;
        int sum2 = a+c;
        int sum3 = b+c;
        int perimeter = a+b+c;
        if(sum1 > c && sum2 > b && sum3 > c){
            System.out.println("The input is valid, the perimeter is = " + perimeter);
        } else {
            System.out.println("The input is invalid");
        }
    }
}