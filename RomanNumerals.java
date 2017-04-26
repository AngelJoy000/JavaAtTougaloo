/**
 * AWT Sample application
 *
 * @author Angel Patterson
 * @version 1.00 17/02/02
 */

        
  import java.util.Scanner;
 
  public class RomanNumerals {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

    // Get a number from the user.
    System.out.print("Enter a number in the range of 1 - 10: \n ");

    int number = keyboard.nextInt(); // User input number

    //close stream
    keyboard.close();

    // Get Roman numeral.
    String RomanNumeral = convertNumberToRomanNumeral(number);

    // Output to user
    System.out.println("Your Roman Numeral Number is  " + RomanNumeral);
}

/**
 * Method should return a Roman numeral that represents
 * the number input.
 *
 * @param number
 * @return String that represents a Roman numeral
 */
static String convertNumberToRomanNumeral(Integer number) {

    switch (number) {
    case 1:
        return "I";

    case 2:
        return "II";

    case 3:
        return "III";

    case 4:
        return "IV";

    case 5:
        return "V";

    case 6:
        return "VI";

    case 7:
        return "VII";

    case 8:
        return "VIII";

    case 9:
        return "IX";

    case 10:
        return "X";

    default:
        return "Invalid number. Please try again and this time follow instructions.";
   
    }
}}