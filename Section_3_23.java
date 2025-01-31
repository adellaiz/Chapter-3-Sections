/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 13:25:32
 * @modify date 2020-07-09 13:32:42
 * @desc [(Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
vertical distance to (0, 0) is less than or equal to 5.0 / 2]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates = ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x <= 5 || y <= 2.5){
            System.out.println("Point " + "(" + x + "," + y + ")" + " is in the rectangle");   
        } else {
            System.out.println("Point " + "(" + x + "," + y + ")" + " is not in the rectangle"); 
        }
    }
}