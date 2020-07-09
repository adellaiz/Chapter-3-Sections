/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 14:57:11
 * @modify date 2020-07-09 15:04:58
 * @desc [(Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is
inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
overlaps circle1 if the distance between the two centers <= r1 + r2]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius = ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius = ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
        double a = Math.pow((x2 - x1), 2);
        double b = Math.pow((y2 - y1), 2);
        double distance = Math.sqrt(a + b);
        if(distance <= Math.abs(radius1 - radius2)){
            System.out.println("circle2 is inside circle1");
        } else if (distance <= (radius1 + radius2)){
            System.out.println("circle2 overlaps circle1" );
        } else {
            System.out.println("circle2 does not overlap circle1 ");
        }
    }
}