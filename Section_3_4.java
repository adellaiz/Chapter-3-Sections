/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-08 16:25:24
 * @modify date 2020-07-08 17:12:30
 * @desc [(Random month) Write a program that randomly
 * generates an integer between 1 and 12 and displays
 * the English month name January, February, …, December
 * for the number 1, 2, …, 12, accordingly.]
 */
package Chapter_3_Section;
public class Section_3_4 {
    public static void main(String[] args) {
        int month = (int)(System.currentTimeMillis());
        switch( month % 12){
            case 1: System.out.println("January");break;
            case 2: System.out.println("February");break;
            case 3: System.out.println("March");break;
            case 4: System.out.println("April");break;
            case 5: System.out.println("May");break;
            case 6: System.out.println("Juni");break;
            case 7: System.out.println("July");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("September");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("December");break;
        }
    }
}