/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 16:30:37
 * @modify date 2020-07-08 16:30:37
 * @desc [Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c = ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double r1 = (-b + Math.sqrt(discriminant))/ (2*a);
        double r2 = (-b - Math.sqrt(discriminant))/ (2*a);
        if(discriminant > 0){
            System.out.printf("The equation has two roots %.6f %.5f",r1,r2);
        } else if(discriminant == 0){
            System.out.printf("The equation has one root %.0f",r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}