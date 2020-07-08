/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 21:43:04
 * @modify date 2020-07-08 21:43:30
 * @desc [(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition question with two integers less than 100.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is " + number1 + " - " + number2 + " ? ");
        int answer = input.nextInt();
        if(number1 - number2 == answer){
            System.out.println("Youre correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}