/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 12:17:22
 * @modify date 2020-07-09 12:35:49
 * @desc [(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
to compute the wind-chill temperature. The formula is valid for temperatures in
the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether the temperature and/or wind speed is
invalid.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperture in Fahrenheit between -58°F and 41°F \t= ");
        double temperature = input.nextDouble();
        System.out.print("Enter the winds speed (>=2) in miles per hour \t\t\t= ");
        int wind = input.nextInt();
        double windChill = (35.74 + (0.6215 * temperature)) - (35.75 * Math.pow(wind, 0.16)) + (0.4275 *temperature *(Math.pow(wind, 0.16)));
        if(wind >= 2 && temperature >= -58 && temperature <= 41){
            System.out.print("The wind chill index is \t\t\t\t\t= " + windChill);
        } else {
            if(wind < 2 && temperature < 41 && temperature < -58){
                System.out.println("The speed and temperature is invalid");
            } else if (wind < 2){
                System.out.println("The speed is invalid");
            } else if (temperature <41 && temperature <-58){
                System.out.println("The temperature is invalid");
            }
        }
    }
}