/*WAP to check given number is primre or not*/
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		System.out.println();
		boolean prime = true;
		for(int i = 2; i<= num/2;i++) {
			if(num % i == 0) {
				prime = false;
				break;
			}
		}
		if(prime)
			System.out.println("GIVEN INPUT NUMBER IS PRIME");
		else
			System.out.println("GIVEN INPUT NUMBER IS NOT PRIME");
	}
}