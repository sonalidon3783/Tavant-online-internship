package MarksValidator;

import java.util.Scanner;



public class MarkValidator {
	
	public boolean isPass(int marks) {
		int result = marks;
		if(result>= 40)
		{
			System.out.println("Result = Pass");
			return true;
		}
		else 
		{
			System.out.println("Result = Fail");
			return false;
		}
	}
	
	public void markGrade(int marks) {
		int mark = marks;
		if(mark>90)
		{
			System.out.println(" Grade = A");
		}
		else if(mark >75)
		{
			System.out.println(" Grade = B");
		}
		else if(mark >60) 
		{
			System.out.println(" Grade = C");
		}
		else
		{
			System.out.println("Grade = D");
		}
		
	} 

	public static void main(String[] args) {
		MarkValidator markvalidator = new MarkValidator();
		System.out.print("Enter the marks\n");
		Scanner scan = new Scanner(System.in);
		int number = scan .nextInt();
		if(markvalidator.isPass(number)!=false)
		{
			markvalidator.markGrade(number);
		}
	}

}
