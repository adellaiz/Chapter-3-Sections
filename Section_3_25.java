/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 13:33:05
 * @modify date 2020-07-09 13:48:01
 * @desc [(Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
The intersecting point of the two lines can be found by solving the following
linear equation:
(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3). If the equation has no solutions, the two lines are parallel
Write a program that prompts the user to enter four points and displays the intersecting point]
 */

package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 = ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a = y1 - y2;
        double b = - (x1 - x2);
        double c = y3 - y4;
        double d = - (x3 -x4);
        double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
        double determinan = (a * d) - (b * c);
        double x = ((e * d) - (b * f)) / determinan;
        double y = ((a * f) - (e * c)) / determinan;
        if(determinan < 0 || determinan > 0)
            System.out.println("The intersecting point is in = x is " + x + " and y is " + y);
        if(determinan == 0)
            System.out.println("The equation has no solution so that the two lines are parallel");
        

    }
}