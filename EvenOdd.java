import java.io.*;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = scan.nextInt();
		System.out.println();
		
		if(num % 2 == 0) {
			
			System.out.println(num + " is an even number");
		}else{
			
			System.out.println(num + " is an odd number");
		}
	}

}
