import java.util.Scanner;
public class MagicNumberFive {
public static void main(String[]args) {
Scanner scanner=new Scanner(System.in);

System.out.println("Enter a number divisible by five");
	double num=scanner.nextDouble();
	double rem=(num%5);
	
	while(rem!=0) {
		System.out.println("Try again");
		num=scanner.nextDouble();
		rem=(num%5);
	}
	
	if (rem==0) {
		double answer=(num/5);
		System.out.println("Good job, the answer is"+" "+answer);
		
	}



}}
