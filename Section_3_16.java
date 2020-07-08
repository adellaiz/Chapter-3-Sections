/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 22:58:32
 * @modify date 2020-07-08 23:04:43
 * @desc [(Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.]
 */
package Chapter_3_Section;

public class Section_3_16 {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 101) - 50;
        int y = (int)(Math.random() * 201) - 100;
        System.out.println("The x is " + x + " and the y is " + y);
    }    
}