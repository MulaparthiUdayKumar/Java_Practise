/*WAP to print factors of a given number.*/
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		System.out.println();
		int num = scan.nextInt();
		int count = 0;
		for(int i = 1; i<= num/2;i++) {
			if(num % i == 0)
				count += 1;
		}
		System.out.println(count);
	}
}