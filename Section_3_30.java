/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 15:08:03
 * @modify date 2020-07-10 10:26:06
 * @desc [Revise Programming Exercise 2.8 to display the hour using a
12-hour clock.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tima zone offset to GMT = ");
        int offset = input.nextInt();
        offset = offset * 60 * 60;
        long totalMiliSeconds = System.currentTimeMillis(); 
        long totalSeconds = (totalMiliSeconds/1000 + offset);
        long currentSecond = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = (totalHours%24);
        String str_hours = "";
        if(currentHours >= 12){
            str_hours = " PM";
        } else if (currentHours < 12){
            str_hours = " AM";
        }
        if(currentHours >= 13){
            currentHours = currentHours - 12;
        } else if (currentHours == 0){
            currentHours = currentHours + 12;
        }
        System.out.println("The current time is = " + currentHours + ":" + currentMinutes + ":" + currentSecond + str_hours);
    }
}