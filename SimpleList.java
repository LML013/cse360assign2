/**
 * The SimpleList class uses two private variables, list and count,
 * to maintain and modify a list of 10 integers.
 * 
 * @author lmluna3
 */
public class SimpleList {
	/**
	 * Main data array containing integer values
	 */
	private int[] list;
	
	/**
	 * Keeps track of how many values are in list array
	 */
	private int count;
	
	/**
	 * SimpleList default constructor.
	 * Creates a new instance of the class SimpleList
	 * Sets new instance private variable count to 0 and
	 * instantiates list array of length 10.
	 */
	public SimpleList() {
		this.list = new int[10];
		this.count = 0;
	}
	
	/**
	 * Adds an integer, number, to the front (0 index) of the list array,
	 * Shifts all other values to the right by one index.
	 * 
	 * @param number
	 */
	public void add(int number) {
		// for loop shifts all values in the array one index higher
		for (int index = this.list.length - 2; index >= 0; index--) {
			this.list[index + 1] = this.list[index];
			}
		
		// sets the first array index position to number input
		this.list[0] = number;
		
		// increments counter but not above 10
		if (this.count <= 9) {
			this.count++;
		}
	}
	
	/**
	 * Searches for an int, number, within list property.
	 * If the int is in array list, returns.
	 * If the int is in array list, removes int from the list by copying over
	 * all numbers to the left of it by one index.
	 * 
	 * @param number
	 */
	@SuppressWarnings("null")
	public void remove(int number) {
		// finds the index of the input number
		int removeIndex = this.search(number);
		
		// handles situation where the number to be removed is not in the array
		if (removeIndex == -1) {
			return;
		} 
		// handles when the number is in the array
		else {
			// for loop shifts all array values to the left by one
			// copies over number to be removed
			// avoids out of bounds error by setting last value to null
			for (int index = removeIndex; 
					index < this.list.length - 1; index++) {
				if(index != this.list.length - 1) {
					this.list[index] = this.list[index + 1];
				} else {
					this.list[index] = (Integer) null;
				}
			}
			this.count--;
		}
		return;
	}
	/**
	 * @return this.count
	 */
	public int count() {
		return this.count;
	}
	
	//TODO: Implement
	/**
	 * Prints out a string of the list array with spaces
	 * 
	 * @return String version of the array with spaces
	 */
	public String toString() {
		String listString = "";
		
		if (this.count > 0) {
			for (int index = 0; index < this.count; index++) {
				// handles the end of the list, no space after
				if(index == this.count - 1) {
					listString += String.valueOf(list[index]);
				}
				// handles intermediate items of the list, has a space after
				else {
					listString += String.valueOf(list[index]) + " ";
				}
			}
		}
		return listString;
	}
	
	/**
	 * Looks for an int, number, within the list array.
	 * If the number is not in the list array, returns -1.
	 * If the number is in the array, returns the index of the number.
	 * 
	 * @param number
	 * @return index array of input int, or -1
	 */
	public int search(int number) {
		int searchIndex = -1;
		
		for (int index = 0; index < this.count; index++) {
			if (searchIndex == -1 && this.list[index] == number) {
				searchIndex = index;
			}
		}
		
		return searchIndex;
	}
}
