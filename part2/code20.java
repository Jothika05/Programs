package part2;

import java.util.Scanner;

public class code20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n + "is prime a number");
		}
		else {
			System.out.println(n + "is not a prime number");
		}
	}

}
