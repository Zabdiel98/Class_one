
public class CozaLozaWoza {
public static void main(String[]args) {
	//n
	for (int x=1;x<=33;x++) {
		int three=(x%3);
		int five=(x%5);
		int seven=(x%7);
			
		if(three==0&&five==0) {
			System.out.print("CozaLoza"+" ");
			}
		
		else if(three==0&&seven==0) {
			System.out.print("CozaWoza"+" ");
			}
		
		else if(five==0&&seven==0) {
			System.out.print("LozaWoza"+" ");
			}
		
		else if(three==0) {
			System.out.print("Coza"+" ");
			}
		
		else if(five==0) {
			System.out.print("Loza"+" ");
			}
		
		else if (seven==0) {
			System.out.print("Woza"+" ");
			}
		else if (x%11==0) {
			System.out.println(x);
			}
		
		else {
			System.out.print(x+" ");
		}
		}
	

}}
