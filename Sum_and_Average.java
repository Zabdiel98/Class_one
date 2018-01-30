
public class Sum_and_Average {
public static void main(String[]args) {
	
	double sum=0;
	double counter=0;
	
for (double i=0; i<=100; i=(i+3)) {
	
	
	sum=(sum+i);
	counter++;
	double avg=(sum/counter);
	
	System.out.println("The number is"+" "+i);
	System.out.println("The sum is"+" "+sum);
	System.out.println("The average is"+" "+avg);
	System.out.println(" ");
	
}

System.out.println("The final average is"+" "+((sum+1)/counter));
}}
