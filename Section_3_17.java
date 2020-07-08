/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 23:06:21
 * @modify date 2020-07-08 23:18:28
 * @desc [(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer = (int)(Math.random() * 3);
        String str_computer = "";
        System.out.print("scrissor (0), rock (1), paper (2) = ");
        int you = input.nextInt();
        String str_you = "";
        String str_output = "";
        if(you > computer){
            str_output = " You won";
        } if (you < computer){
            str_output = " You lose";
        } if (you == computer){
            str_output = " It is a draw";
        }
        switch (computer) {
            case 0: str_computer = " scissor";break;
            case 1: str_computer = " rock";break;
            case 2: str_computer = " paper";break;
        }
        switch (you) {
            case 0: str_you = " scissor";break;
            case 1: str_you = " rock";break;
            case 2: str_you = " paper";break;
        }
        System.out.println("The computer is" + str_computer + "." + " You are " + str_you + "." + str_output);
    }
}