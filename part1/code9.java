package part1;

import java.util.Scanner;

public class code9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user input");
		long num=sc.nextLong();

		int count=0;
		while(num!=0) {
			num=num/10;  //123/10
			count++;
		}
		System.out.println("number of digits: "+count);
	
	}

}
