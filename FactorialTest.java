package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial junit = new Factorial();
		int result = junit.CalculateFactorial(3);
		int actual= result;
		int expect = 6;
		assertEquals(actual,expect);
		
	}

}






