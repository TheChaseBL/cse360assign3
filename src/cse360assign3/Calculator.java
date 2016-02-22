/**
 * @author Chase Lybbert
 * @version First Version
 * PIN: 520
 * This program uses a value and makes calculations depending on which methods are called.
 */

package cse360assign3;

public class Calculator {

	private int total;
	
	/**
	 * Calculator object that uses the add, subtract, multiply and divide operations.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Used to display to the screen the total number after calculations have been done.
	 * @return	The total of the calculated value.
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Used to add a number to the running total.
	 * @param value The number to be added to the current total.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Used to subtract a number to the running total.
	 * @param value The number to be subtracted to the current total.
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Used to multiply a number to the running total.
	 * @param value The number to be multiplied to the current total.
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Used to divide a number to the running total.
	 * @param value The number to be divided to the current total.
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * Displays the history of calculations applied.
	 * @return	A string of what calculations have been applied to the total.
	 */
	public String getHistory () {
		return "";
	}
}