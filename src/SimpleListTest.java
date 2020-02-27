package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * SimpleListTest contains junit tests for testing the properties and methods 
 * of class SimpleList.
 * 
 * @author lmluna3
 * Class ID 192
 *
 */
class SimpleListTest {

	/**
	 * Instantiates class, checks to see that count starts at 0
	 */
	@Test
	void testSimpleList1() {
		SimpleList simpleList = new SimpleList();
		assertTrue(simpleList.count() == 0);
	}
	
	/**
	 * Instantiates class,
	 * adds 11 ints to the list array,
	 * makes sure that the array contains correct values
	 */
	@Test
	void testSimpleList2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.add(10);
		simpleList.add(11);
		assertTrue(simpleList.toString()
				.contentEquals("11 10 9 8 7 6 5 4 3 2 1"));
	}

	/**
	 * Adds one int, checks that it was added at position 0
	 */
	@Test
	void testAdd0() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		assertTrue(simpleList.toString().contentEquals("1"));
	}
	
	/**
	 * Adds three ints, checks that count is 3
	 */
	@Test
	void testAdd1() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(3);
		simpleList.add(2);
		simpleList.add(1);
		assertTrue(simpleList.count() == 3);
	}
	
	/**
	 * Adds a zero, checks that add increases the count by one
	 */
	@Test
	void testAdd2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(0);
		assertTrue(simpleList.count() == 1 
				&& simpleList.toString().contentEquals("0"));
	}	
	
	/**
	 * Checks to see if the list increases in size
	 */
	@Test
	void testAdd3() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.add(10);
		simpleList.add(11);
		simpleList.add(12);
		simpleList.add(13);
		simpleList.add(14);
		simpleList.add(15);
		assertTrue(simpleList.count() == 15);
	}

	/**
	 * Adds integers 1 thru 10 into list array
	 * Removes the number 5
	 * Checks to make sure the count is 9, 5 is not in the array
	 * and 4 is in index 5
	 */
	@Test
	void testRemove1() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.add(10);
		simpleList.remove(5);
		assertTrue(simpleList.count() == 9 &&
				simpleList.search(5) == -1 &&
				simpleList.search(4) == 5);
	}

	/**
	 * Adds 1 to array[0], attempts to remove 5 from the list
	 * Should not change the array
	 */
	@Test
	void testRemove2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.remove(5);
		assertTrue(simpleList.toString().contentEquals("1"));
	}
	
	/**
	 * Adds 1 to array[0], attempts to remove 5 from the list
	 * Should not change the array
	 */
	@Test
	void testRemove3() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.remove(1);
		assertTrue(simpleList.toString().contentEquals(""));
	}

	/**
	 * Adds 11 integers to the list array,
	 * tests to make sure count keeps up.
	 */
	@Test
	void testCount() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.add(10);
		simpleList.add(11);
		assertTrue(simpleList.count() == 11);
	}

	/**
	 * Adds three ints to the list array,
	 * checks that the toString method outputs those three with spaces
	 * in the correct order
	 */
	@Test
	void testToString1() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		assertTrue(simpleList.toString().contentEquals("3 2 1"));
	}
	
	/**
	 * Adds three ints to the list array, removes one
	 * checks that the toString method outputs those two with spaces
	 * in the correct order
	 */
	void testToString2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.remove(2);
		assertTrue(simpleList.toString().contentEquals("3 1"));
	}	

	/**
	 * Adds 3 ints to the list array
	 * Checks if 2 is in index 1
	 */
	@Test
	void testSearch1() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		assertTrue(simpleList.search(2) == 1);
	}
	
	/**
	 * Adds 3 ints to the list array
	 * Checks to make sure the trailing 0s in the array are not searched
	 */
	@Test
	void testSearch2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		assertTrue(simpleList.search(0) == -1);
	}	

	/*
	 * Checks when append does not need to increase the size of the array
	 */
	@Test
	void testAppend() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.append(4);
		assertTrue(simpleList.toString()
				.contentEquals("3 2 1 4"));
	}
	
	/*
	 * Checks when append does not need to increase the size of the array
	 */
	@Test
	void testAppend2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.add(10);
		simpleList.add(11);
		simpleList.append(12);
		assertTrue(simpleList.toString()
				.contentEquals("11 10 9 8 7 6 5 4 3 2 1 12"));
	}

	/*
	 * Checks situation of an empty list returning -1
	 */
	@Test
	void testFirst1() {
		SimpleList simpleList = new SimpleList();
		assertTrue(simpleList.first() == -1);
	}
	
	/*
	 * Checks situation of returning the first item of a list
	 */
	@Test
	void testFirst2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		assertTrue(simpleList.first() == 1);
	}	
	
	/*
	 * Checks situation of an empty list returning -1
	 */
	@Test
	void testLast1() {
		SimpleList simpleList = new SimpleList();
		assertTrue(simpleList.last() == -1);
	}
	
	/*
	 * Checks situation of returning the last item of a list
	 */
	@Test
	void testLast2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		assertTrue(simpleList.last() == 1);
	}	
	
	/*
	 * Checks size is working and list is initially length 10
	 */
	@Test
	void testSize1() {
		SimpleList simpleList = new SimpleList();
		assertTrue(simpleList.size() == 10);
	}	
	
	/*
	 * Checks size is working and list expands to 15 after 11 items are added
	 */
	@Test
	void testSize2() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.add(7);
		simpleList.add(8);
		simpleList.add(9);
		simpleList.add(10);
		simpleList.add(11);
		assertTrue(simpleList.size() == 15);
	}	
	
	/*
	 * Checks size is working and list contracts to 7 after 6 items are added
	 * and one is removed
	 */
	@Test
	void testSize3() {
		SimpleList simpleList = new SimpleList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.add(5);
		simpleList.add(6);
		simpleList.remove(6);
		System.out.println(simpleList.size());
		assertTrue(simpleList.size() == 7);
	}
	
}
