/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 21:47:40
 * @modify date 2020-07-08 22:13:30
 * @desc [(Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month and year = ");
        int month = input.nextInt();
        String str_month = "";
        int day = 0;
        int year = input.nextInt();
        if(year % 4 == 0){
            if(month == 1){
                str_month = "January";
                day = 31;
            } else if(month == 2){
                str_month = "February";
                day = 29;
            } else if(month == 3){
                str_month = "March";
                day = 31;
            } else if(month == 4){
                str_month = "April";
                day = 30;
            } else if(month == 5){
                str_month = "May";
                day = 31;
            } else if(month == 6){
                str_month = "June";
                day = 30;
            } else if(month == 7){
                str_month = "July";
                day = 31;
            } else if(month == 8){
                str_month = "August";
                day = 31;
            } else if(month == 9){
                str_month = "September";
                day = 30;
            }else if(month == 10){
                str_month = "October";
                day = 31;
            }else if(month == 11){
                str_month = "November";
                day = 30;
            }else if(month == 12){
                str_month = "December";
                day = 31;
            }
        } else {
            if(month == 1){
                str_month = "January";
                day = 31;
            } else if(month == 2){
                str_month = "February";
                day = 29;
            } else if(month == 3){
                str_month = "March";
                day = 31;
            } else if(month == 4){
                str_month = "April";
                day = 30;
            } else if(month == 5){
                str_month = "May";
                day = 31;
            } else if(month == 6){
                str_month = "June";
                day = 30;
            } else if(month == 7){
                str_month = "July";
                day = 31;
            } else if(month == 8){
                str_month = "August";
                day = 31;
            } else if(month == 9){
                str_month = "September";
                day = 30;
            }else if(month == 10){
                str_month = "October";
                day = 31;
            }else if(month == 11){
                str_month = "November";
                day = 30;
            }else if(month == 12){
                str_month = "December";
                day = 31;
            }
        }
        System.out.println(str_month + " " + year + " had " + day + " days");
    }
}