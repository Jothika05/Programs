package part1;

import java.util.Scanner;

public class code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user input");
		int num=sc.nextInt();
		if(num>0) 
			System.out.println("Positive Number");
		else if(num<0)
			System.out.println("Negative Number");
		else
			System.out.println("Neither positive or negative");
	}
	

}
