/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 17:15:34
 * @modify date 2020-07-08 17:25:39
 * @desc [(Health application: BMI) Revise Listing 3.4,
 * ComputeAndInterpretBMI.java, to let the user enter weight,
 * feet, and inches. For example, if a person is 5 feet and 10 inches,
 * you will enter 5 for feet and 10 for inches.]
 */
package Chapter_3_Section;
import java.util.Scanner;
public class Section_3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds \t= ");
        double weight = input.nextDouble();
        System.out.print("Enter feet \t\t= ");
        double feet = input.nextDouble();
        System.out.print("Enter inches \t\t= ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double FEET_PER_INCH = 12;
        final double INCH_PER_METER = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = ((feet * FEET_PER_INCH) + inches) * INCH_PER_METER;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi <30){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}