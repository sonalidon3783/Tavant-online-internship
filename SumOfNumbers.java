package sum;

public class SumOfNumbers {
	
	public static int sumOfEvenNumbers(int start, int end)
	{
		int sumeven=0;
		for(int i=start;i<=end;i++)
			if(i%2==0)
			{
				sumeven=sumeven+i;
			}
		return sumeven;
	}
	public static int sumOfOddNumbers( int start, int end)
	{
		int sumodd=0;
		for(int i=start;i<=end;i++)
			if(i%2!=0)
			{
				sumodd=sumodd+i;
			}
		return sumodd;
	}
	
	
			
}
