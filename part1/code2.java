package part1;

import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user input");
		char ch=sc.next().charAt(0);
		if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z') {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not an alphabet");
		}
	}

}
