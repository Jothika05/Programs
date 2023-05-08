package part3;

import java.util.Scanner;

public class code30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  string");
		String s1=sc.next();
		int count=0;
		for(char c:s1.toCharArray()) {
			count++;
		}
			System.out.println(count);
		
	}

}
