import java.util.Scanner;
public class WhileSquares {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	int i=0;
	
	System.out.println("What is your first number?");
		int x=scanner.nextInt();
	System.out.println("What is your second number?");
		int y=scanner.nextInt();
		
	while (x<=y) {
		i=(i+(x*x));
		System.out.println("The square is"+" "+(x*x));
		x++;
	}
	System.out.println("The total sum is"+" "+i);
}}
