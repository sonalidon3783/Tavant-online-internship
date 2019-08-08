package sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void test() {
		
		SumOfNumbers junit = new SumOfNumbers();
		int result = junit.sumOfEvenNumbers(1, 10);
		int result1 =junit.sumOfOddNumbers( 1,10);
		
		assertEquals(30,result);
		assertEquals(25,result1);
	}
	}


