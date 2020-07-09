/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 12:36:35
 * @modify date 2020-07-09 13:03:23
 * @desc [(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week. 
 ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
Wednesday, 5: Thursday, 6: Friday).
 ■ q is the day of the month.
 ■ m is the month (3: March, 4: April, …, 12: December). January and February
are counted as months 13 and 14 of the previous year.
 ■ j is the century (i.e., year
100 ).
 ■ k is the year of the century (i.e., year % 100).
Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and
displays the name of the day of the week.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year \t\t\t= ");
        int year = input.nextInt();
        System.out.print("Enter month \t\t\t= ");
        int m = input.nextInt();
        if(m == 1){
            m = 13;
        } else if(m == 2){
            m = 14;
        }
        System.out.println(m);
        System.out.print("Enter the day of the month (1-31) \t= ");
        int q = input.nextInt();
        String str_day = "";
        int j = year / 100;
        int k = year % 100;
        int a = q + (26 * (m+1))/10;
        int b = k + (k/4) + (j/4) + (5*j);
        int h = (a + b)%7; 
        switch (h) {
            case 0: str_day = "Saturday";break;
            case 1: str_day = "Sunday";break;
            case 2: str_day = "Monday";break;
            case 3: str_day = "Tuesday";break;
            case 4: str_day = "Wednesday";break;
            case 5: str_day = "Thursday";break;
            case 6: str_day = "Friday";break;
        }
        System.out.println("Day of the week is " + str_day);
    }
}