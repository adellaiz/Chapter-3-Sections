/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 11:17:20
 * @modify date 2020-07-09 11:17:20
 * @desc [(Cost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in
pounds).
c(w) = d
3.5, if 0 6 w 6 = 1
5.5, if 1 6 w 6 = 3
8.5, if 3 6 w 6 = 10
10.5, if 10 6 w 6 = 20
Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in pounds) \t= ");
        int weight = input.nextInt();
        double cost = 0;
        if(weight <= 20 && weight > 10){
            cost = 10.5;
        } else if(weight <= 10 && weight > 3){
            cost = 8.5;
        } else if(weight <= 3 && weight > 1){
            cost = 5.5;
        } else if(weight <= 1 && weight > 0){
            cost = 3.5;
        }
        if(weight > 50 || cost == 0){
            System.out.println("The package cannot be shipped");
        } else {
            System.out.print("The cost is \t\t\t\t\t= " + cost);
        }
    }
}   