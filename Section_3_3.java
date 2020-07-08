/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 16:25:01
 * @modify date 2020-07-08 16:29:33
 * @desc [(Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
that “The equation has no solution.”]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f = ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double determinan = (a * d) - (b * c);
        double x = ((e * d) - (b * f)) / determinan;
        double y = ((a * f) - (e * c)) / determinan;
        if(determinan < 0 || determinan > 0)
            System.out.println("x is " + x + " and y is " + y);
        if(determinan == 0)
            System.out.println("The equation has no solution");
    }
}