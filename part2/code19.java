package part2;

import java.util.Scanner;

public class code19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int rem,sum=0;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong Number");	
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		}}
		
	*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int digits=0,rem;
		double sum=0;
		int temp=n;
		for(int i=n;i>0;i=i/10)
			digits++;
		
		while(n!=0) {
			rem=n%10;
			sum=sum+Math.pow(rem,digits);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong Number");	
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
		
		
		
	}}
