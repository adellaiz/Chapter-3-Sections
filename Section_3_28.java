/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 14:28:40
 * @modify date 2020-07-09 14:52:13
 * @desc [(Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height = ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height = ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        double distanceX = Math.abs(x1 - x2);
        double distanceY = Math.abs(y1 - y2);
        double distanceW_in = Math.abs(w1 - w2);
        double distanceH_in = Math.abs(h1 - h2);
        double distanceW_out = Math.abs(w1 + w2);
        double distanceH_out = Math.abs(h1 + h2);
        if(distanceX <= distanceW_in / 2 && distanceY <= distanceH_in / 2){
            if(w2 > w1){
                System.out.println("r1 is inside r2");
            } else if (w1 > w2){
                System.out.println("r2 is inside r1");
            } else {
                System.out.println("Rectangle are the same");
            }
        } else if (distanceX <= distanceW_out / 2 && distanceY <= distanceH_out / 2){
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}