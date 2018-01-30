
public class Odd_Numbers {
public static void main(String[]args) {
	
	int sum=0;
	
	for(int x=0;x<=50;x++) {
		int n=(x%2);
		
		if (n==1) {
			sum=(sum+x);
		}
	}
	System.out.print(sum);
}}

