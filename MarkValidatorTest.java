package MarksValidator;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class MarkValidatorTest {


	@Test
	public void test() {
		MarkValidator markValidator =new MarkValidator();

		boolean actual= true;
		boolean expect = markValidator.isPass(52);
		if(expect!=false) {
			markValidator.markGrade(52);
			assertEquals(actual,expect);
		}else
		{
			assertNotEquals(actual,expect);
		}

	
	}
	}


	

	
	

	
	












