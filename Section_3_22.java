/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 13:08:17
 * @modify date 2020-07-09 13:18:52
 * @desc [(Geometry: point in a circle?) Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0)
with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
circle]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates (x1,x2,y1,y2) = ");
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        int a = (int) Math.pow((x2 - x1), 2);
        int b = (int) Math.pow((y2 - y1), 2);
        int distance = (int) Math.sqrt(a + b);
        if(distance <= 10){
            System.out.println("Point " + "(" + x1 + "." + x2 + "," + y1 + "." + y2 + ")" + " is in the circle");
        } else {
            System.out.println("Point " + "(" + x1 + "." + x2 + "," + y1 + "." + y2 + ")" + " is not in the circle");
        }
    }
}