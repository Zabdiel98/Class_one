import java.util.Scanner;
public class Electoral_System {
	public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("How many electorates are you verifying?");
		int x=scanner.nextInt();
		
	for (int i=1; i<=x; i++) {

		System.out.println("What is the electorate's age?");
			int age=scanner.nextInt();
		
			if (age<18) {
				System.out.println("Electorate cannot vote");
			}
			else if (age==18) {
				System.out.println("Electorate can vote");
			}
			else if  (age>18) {
				System.out.println("Electorate can vote and can apply for driver's license.");
			}
	}
}}
