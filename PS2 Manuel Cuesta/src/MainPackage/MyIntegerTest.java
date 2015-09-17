package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	//--------------------------------------------------------------
	@Test
	public void testIsEven() {
		MyInteger myIntEven = new MyInteger(2);
		MyInteger myIntOdd = new MyInteger(3);
		assertTrue(myIntEven.isEven() == true);
		assertFalse(myIntOdd.isEven() == true);
	}

	//--------------------------------------------------------------
	@Test
	public void testIsOdd() {
		MyInteger myIntOdd = new MyInteger(3);
		MyInteger myIntEven = new MyInteger(2);
		assertTrue(myIntOdd.isOdd() == true);
		assertFalse(myIntEven.isOdd() == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testIsPrime() {
		MyInteger myIntPrime = new MyInteger(7);
		MyInteger myIntNotPrime = new MyInteger(15);
		assertTrue(myIntPrime.isPrime() == true);
		assertFalse(myIntNotPrime.isPrime() == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testIsEvenInt() {
		MyInteger myIntEvenInt = new MyInteger(2);
		MyInteger myIntOddInt = new MyInteger(3);
		assertTrue(myIntEvenInt.isEven() == true);
		assertFalse(myIntOddInt.isEven() == true);
		
	}
	//--------------------------------------------------------------
	@Test
	public void testIsOddInt() {
		MyInteger myIntOddInt = new MyInteger(3);
		MyInteger myIntEvenInt = new MyInteger(2);
		assertTrue(myIntOddInt.isOdd() == true);
		assertFalse(myIntEvenInt.isOdd() == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testIsPrimeInt() {
		MyInteger myIntPrimeInt = new MyInteger(7);
		MyInteger myIntNotPrimeInt = new MyInteger(15);
		assertTrue(myIntPrimeInt.isPrime() == true);
		assertFalse(myIntNotPrimeInt.isPrime() == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testIsEven1() {
		MyInteger myIntEven1 = new MyInteger(2);
		MyInteger myIntOdd1 = new MyInteger(3);
		assertTrue(myIntEven1.isEven() == true);
		assertFalse(myIntOdd1.isEven() == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testIsOdd1() {
		MyInteger myIntOdd1 = new MyInteger(3);
		MyInteger myIntEven1 = new MyInteger(2);
		assertTrue(myIntOdd1.isOdd() == true);
		assertFalse(myIntEven1.isOdd() == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testIsPrime1() {
		MyInteger myIntPrime1 = new MyInteger(7);
		MyInteger myIntNotPrime1 = new MyInteger(15);
		assertTrue(myIntPrime1.isPrime() == true);
		assertFalse(myIntNotPrime1.isPrime() == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testEqualsInt() {
		MyInteger myIntEquals = new MyInteger(5);
		assertTrue(myIntEquals.equals(5) == true);
		assertFalse(myIntEquals.equals(4) == true);
	}
	//--------------------------------------------------------------
	@Test
	public void testEqualsMyInteger() {
		MyInteger myIntEquals = new MyInteger(5);
		assertTrue(myIntEquals.equals(5) == true);
		assertFalse(myIntEquals.equals(4) == true);
	}
}