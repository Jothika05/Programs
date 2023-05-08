package part3;

import java.util.Scanner;

public class code21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int n=sc.nextInt();
		int rem,rev=0;
		int isPalindrome=n;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(isPalindrome==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}












