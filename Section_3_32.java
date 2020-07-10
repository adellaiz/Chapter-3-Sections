/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 10:36:10
 * @modify date 2020-07-10 10:43:53
 * @desc [(Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
y1), you can use the following condition to decide whether a point p2(x2, y2) is
on the left of the line, on the right, or on the same line]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_32 {
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
        if(((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1)) && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1))){
            if(point > 0 ){
                str_output = " is not on the line segment";
            } else if (point == 0){
                str_output = " is on the line segment";
            } else if (point < 0){
                str_output = " is not on the line segment";
            }
        }
        System.out.print("(" + x2 + "," + y2 + ")" + str_output + " form " + "(" + x0 + "," + y0 + ")" + " to " + "(" + x1 + "," + y1 + ")");
    }
}