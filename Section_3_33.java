/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 10:44:28
 * @modify date 2020-07-10 10:53:34
 * @desc [(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1 = ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2 = ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        double total1 = p1/w1;
        double total2 = p2/w2;
        if(p1 > p2){
            System.out.println("Package 2 has a better price.");
        } else if (p2 > p1){
            System.out.println("Package 1 has a better price.");
        } else if (p1 == p2){
            System.out.println("Two packages have the same price.");
        }
    }
}