package factorial;

public class Factorial {
	


	
		
		public static int CalculateFactorial(int number)
		{
			int fact=1;
			for(int i=1;i<=number;i++)
			{
			fact=fact*i;
			}
			return fact;
			
		}

	}


