/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 10:54:09
 * @modify date 2020-07-10 11:14:22
 * @desc [(Geometry: point on line segment) Programming Exercise 3.32 shows how to test
whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
test whether a point is on a line segment. Write a program that prompts the user
to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
segment from p0 to p1.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2 = ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double point = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
        String str_output = "";
        double max,min;
        if(x1 >= x0){
            max = x1;
            min = x0;
        } else {
            max = x0;
            min = x1;
        }
        if(max >= x2 && x2 >= min && point == 0){
            str_output = " is on the line segment ";
        } else {
            str_output = " is not on the line segment ";
        }
        System.out.print("(" + x2 + "," + y2 + ")" + str_output + " form " + "(" + x0 + "," + y0 + ")" + " to " + "(" + x1 + "," + y1 + ")");
    }
}
