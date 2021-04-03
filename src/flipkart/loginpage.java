package flipkart;

import java.util.Scanner;

public class loginpage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("number is odd");
		}else {
			System.out.println("number is even");
		}
	}

}
