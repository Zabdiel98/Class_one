import java.util.Scanner;
public class Rem_and_Quo {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Please enter a number");
	double x=scanner.nextDouble();
	
	System.out.println("Please enter another number");
	double y=scanner.nextDouble();
	
	double quo=(x/y);
	double rem=(x%y);
	
	System.out.println("The quotient is"+" "+quo+" "+"and the remainder is"+" "+rem);
	
}
}
