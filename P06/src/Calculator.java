/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: 21012434
 * Student ID: 21012434
 * Class: {type your class here}
 * Date/Time created: Friday 27-05-2022 11:28
 */

/**
 * @author 21012434
 *
 */
public class Calculator {
	public int add (int a, int b) {
		
		return a + b;
	    }
	public int subtract (int a, int b) {
		return a - b;	
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		
		if (b == 0) {
			throw new IllegalArgumentException("b cannot be 0");	
		    }
		     
		    return a / b;		
	}
	
}
