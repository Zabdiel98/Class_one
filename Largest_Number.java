import java.util.Scanner;
public class Largest_Number {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("What is your first number?");
		int first=scanner.nextInt();
	System.out.println("What is your second number?");
		int second=scanner.nextInt();
	System.out.println("What is your third number?");
		int third=scanner.nextInt();
		
	if (first>second&&first>third) {
		System.out.println(first +" "+"is the greatest number.");
	}
	else if (second>first&&second>third) {
		System.out.println(second +" "+"is the greatest number.");
	}
	else if (third>first&&third>second) {
		System.out.println(third +" "+"is the greatest number.");
	}
	else {
		System.out.println("ughhg");
	}
}}
