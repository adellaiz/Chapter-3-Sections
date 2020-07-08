/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 16:30:23
 * @modify date 2020-07-08 16:30:23
 * @desc [(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 8 % 10);
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ? = ");
        int answer1 = input.nextInt();
        int answer2 = number1 + number2 + number3;
        boolean isTrue = true;
        if(answer1 == answer2){
            isTrue = true;
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer2 + " is " + isTrue);
        } else {
            isTrue = false;
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer1 + " is " + isTrue);
        }
    }
}