package MainPackage;
// Import the Scanner Utility to Ask user for an integer



public class MyInteger {
	
	private int value;
	
	
	// Constructor to set up the get method for 'value'
	public MyInteger(int value) {
		// TODO Auto-generated constructor stub
		// This is a constructor that allows for application or
		// implementation of 'value'
		this.value = value;
	}
	// the get method for 'value'
	public int getvalue() {
		return this.value;
	}
	// Now for the other methods
	// Not sure if these are right, check them with TA ************************
	// the isEven Method for seeing if 'value' is Even
	public boolean isEven() {
		// A way to check to see if an integer is even is to see
		// if it has a remainder after dividing it by 2 through the % operator
		return this.value%2==0;
		// Double equal sign is needed when dealing with boolean expressions
		// The above line checks to see if the int value has any remainders
		// after being divided by two, if it's True, returns True, if False, Returns False
	}
	
	// the isOdd Method for seeing if 'value' is Odd
	public boolean isOdd() {
		// Same Idea as isEven, but if the remainder does not equal 0, then it's odd
		return this.value%2!=0;
	}
	
	// the isPrime Method for seeing if value is Prime
	public boolean isPrime() {
		/* if we check to see if there is a number from 2 to the 'value'
		   and we get to the point where every number is leaving a remainder
	       except 1 and 'value' then the 'value' is prime, otherwise, False
	    */
		// A for loop starting at 2, going to one less than 'value'
		// and increasing by one every time it runs through the iteration
		for (int num=2; num<this.value; num++) {
			if (this.value%num==0) {
				// if the 'if' parameter is True, then 'value' is not Prime
				return false;
			}
		}
		// If the for loop runs and never returns False, then 'value' is Prime
		return true;
	}
	// The isEven(int), isOdd(int), and isPrime Methods
	// very similar as before, but different
	public static boolean isEven(int value) {
		return value%2==0;
	}
	public static boolean isOdd(int value) {
		return value%2!=0;
	}
	public static boolean isPrime(int value) {
		for (int num=2; num<value; num++) {
			if (value%num==0) {
				return false;
			}
		}
		return true;
	}
	// The isEven, Odd, and Prime (MyInteger) Methods
	// Still similar as before, but different
	// must use the .getvalue() method that I created above to get the value from the MyInteger Constructor
	public static boolean IsEven(MyInteger value) {
		return value.getvalue()%2==0;
	}
	public static boolean IsOdd(MyInteger value) {
		return value.getvalue()%2==0;
	}
	public static boolean IsPrime(MyInteger value) {
		for (int num=2; num<value.getvalue(); num++) {
			if (value.getvalue()%2==0) {
				return false;
			}
		}
		return true;
	}
	// The equals(int) and equals(MyInteger) Methods
	// use same techniques, respectively, to retrieve the 'value'
	public boolean equals(int other_value) {
		return value==other_value;
	}
	public boolean equals(MyInteger other_value) {
		return this.value==other_value.getvalue();
		// must use this.value to compare the integer of 'value' before to another value that MyInteger makes,
		// through the .getvalue() method
	}
	// static method parseInt(char[])
	// first, make an array of numbers in char[] type
	public static char[] array = { '1', '2', '3', '4', '5'};
	public static int parseInt(char[] String) {
		// Instead of writing out lines of code, use the parseInt() method under the Integer class
		return parseInt(array);
	}
		
	
	
	
	public static void main(String[] args) {
		
	}


}
