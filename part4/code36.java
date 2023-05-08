package part4;

import java.util.Scanner;

public class code36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		String first=s.substring(0, 1);
		String last=s.substring( s.length()-1);
		String middle=s.substring(1, s.length()-1);
		
		String s1=first.toUpperCase();
		String s2=last.toUpperCase();
		String result=s1+middle+s2;
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
