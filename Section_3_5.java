/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 16:32:00
 * @modify date 2020-07-08 17:15:09
 * @desc [(Find future dates) Write a program that prompts the user
 * to enter an integer for today’s day of the week (Sunday is 0,
 * Monday is 1, …, and Saturday is 6). Also prompt the user to
 * enter the number of days after today for a future day and display
 * the future day of the week.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day = ");
        int day = input.nextInt();
        String day2 = "";
        System.out.print("Enter the number of days elapsed since today = ");
        int tomorrow = input.nextInt();
        String tomorrow2 = "";
        switch (day) {
            case 0:  day2 = "Sunday";break;
            case 1:  day2 = "Monday";break;
            case 2:  day2 = "Tuesday";break;
            case 3:  day2 = "Wednesday";break;
            case 4:  day2 = "Thursday";break;
            case 5:  day2 = "Friday";break;
            case 6:  day2 = "Saturday";break;
        }
        switch (tomorrow % 7) {
            case 6: tomorrow2 = "Sunday";break;
            case 5: tomorrow2 = "Monday";break;
            case 4: tomorrow2 = "Tuesday";break;
            case 3: tomorrow2 = "Wednesday";break;
            case 2: tomorrow2 = "Thursday";break;
            case 1: tomorrow2 = "Friday";break;
            case 0: tomorrow2 = "Saturday";break;
        }
        System.out.println("Today is " + day2 + " and the future day is " + tomorrow2);
    }
}