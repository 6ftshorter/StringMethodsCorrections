package Test;

import java.util.Scanner;

public class NewTest {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {		
		String userInput,newString="no";
		
		System.out.println("Enter the string");
		userInput=in.next();
		char option;
		
		do {
		
			System.out.println("Enter your choice\n"
					+ "1.The input string is:\n"
					+ "2.Find character at a position\n"
					+ "3.Check if the strings are equal\n"
					+ "4.Check if the string ends with\n"
					+ "5.Check index of a character\n"
					+ "6.check if the string is empty\n"
					+ "7.Find the last index of a character\n"
					+ "8.Replace the substring\n"
					+ "9.Make a substring of the string\n");
			
			
		int x = in.nextInt();
		switch(x) {
		
		case 1:
			System.out.println("Entered  string:"+userInput);
			break;	
			
		case 2:
			
			System.out.println("Character at Position:"+findPos(userInput));
			break;	
			
		case 3:
			System.out.println("Enter the string to compare \t");
			newString= in.next();
			if(userInput.equals(newString)) {
				System.out.println("Yes the strings are equal\n");
			}
			else {
				System.out.println("No the strings are unequal\n");

			}
			break;	
			
		case 4:
			
			System.out.println("Enter the string to check: \n");
			String checkStr=in.next();
			System.out.println("Ends with:"+userInput.endsWith(checkStr));
			break;	
			
		case 5:
			System.out.println("Enter the character to check index: ");
			char indChar=in.next().charAt(0);
			System.out.println("index of "+indChar+" is"+userInput.indexOf(indChar));
			break;	
			
		case 6:
			if(userInput.isEmpty()) {
				System.out.println("Yes the string is empty\n");
			}
			else {
				System.out.println("No the string is not empty\n");

			}
			break;	
			
		case 7:
			System.out.println("Enter the character to check its last occurence:");
			char lastChar=in.next().charAt(0);
			System.out.println("The last index of the character"+lastChar+"is:"+userInput.lastIndexOf(lastChar));
			break;	
			
		case 8:
			System.out.println("Enter the substring:");
			String repStr=in.next();
			System.out.println("Original string: "+newString+"\nReplaced the string:"+userInput.replaceFirst(newString, repStr));
			break;	
			
		case 9:
			System.out.println("Substring of "+userInput+" "+userInput.substring(2));
			break;	
			
		default:
			System.out.println("Invalid input\n");
			break;

		}
		System.out.println("Do you wish to continue?(Y/N)");
		option=in.next().charAt(0);
		}while(option=='y'||option=='Y');
		}
	
	public static char findPos(String s) {
		System.out.println("Enter the position of ur choice:");
		int pos=in.nextInt();
		if(pos<s.length()) {
		return s.charAt(pos);
		}
		else {
			System.out.println("String index exceeded!\n");
			return '0';
		}
	
	}

}
