
package part1;

import java.util.Scanner;

public class code7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month:");
		int month=sc.nextInt();
		System.out.println("Enter the year:");
		int year=sc.nextInt();
	//if( (month==2 &&  year%4==0) || (month==2 && year%100==0 && year%400==0 ))
	 if(( (month==2) && (year%400==0)) || ( (month==2) &&(year%4==0) && (year%100!=0)) ) //
			System.out.println("29 days");
		else if(month==2)
			System.out.println("28 days");
		
		else if(month==1||month==3||month==5||month==7|| month==8||month==10||month==12)
			System.out.println("31days");
		else
			System.out.println("30days");

	}
}