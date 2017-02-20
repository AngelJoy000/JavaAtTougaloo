import javax.swing.JOptionPane;

/**
 * @Date   June 19, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 191 Challenge: Book Club Points
 * 
 * @Description Write a program that asks the user to enter the number
 * of books that he or she has purchased this month and then displays 
 * the number of points awarded.
 */

public class BookClubPoints {

	public static void main(String[] args) {
		// Declare variable to hold number of books purchased
		int numberBooks;
		
		// Prompt user for number of books and store in temporary variable
		String display = JOptionPane.showInputDialog("Enter the number of monthly books purchased");
		
		// Convert user input to data-type int
		numberBooks = Integer.parseInt(display);
		
		// Design if-else structure to display the appropriate amount of 
		// points earned given the quantity of books purchased for the month.
		
		if(numberBooks >= 0)
			if(numberBooks == 0)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 0");
			else if(numberBooks == 1)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 5");
			else if(numberBooks == 2)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 15");
			else if(numberBooks == 3)
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 30");
			else
				JOptionPane.showMessageDialog(null, "Books Purchased: " + numberBooks + "\nPoints Earned: 60");
		else
			JOptionPane.showMessageDialog(null, "Invalid input");
		

	}

}
