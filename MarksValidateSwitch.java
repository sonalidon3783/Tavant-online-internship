package marksvalidate;

import java.util.Scanner;

public class MarksValidateSwitch {
	
	public boolean isPass(int marks) {
		int result = marks;
		if(result>= 40) {
			System.out.println("Result = Pass");
			return true;
		}
		else {
			System.out.println("Result = Fail");
			return false;
		}
	}
	
	public void markGrade(int marks) {
		int mark = marks;
		switch(mark) 
	        {
			case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73:  case 74:
			 case 75:
				{
				System.out.println(" Grade = C");
				break;
			}
				
			case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
			case 90:
				{
				System.out.println(" Grade = B");
				break;
				}
				
			case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 100:
			 {
				System.out.println(" Grade = A");
				break;
			}

	default:
			System.out.println("Grade = D");	
		}
	} 

	public static void main(String[] args) {
		MarksValidateSwitch markvalidator = new MarksValidateSwitch();
		System.out.print("Enter the marks\n");
		Scanner scan = new Scanner(System.in);
		int number = scan .nextInt();
		if(markvalidator.isPass(number)!=false)
		{
			markvalidator.markGrade(number);
		}
	}

	}




