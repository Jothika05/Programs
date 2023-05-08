package part4;

import java.util.Arrays;
import java.util.Scanner;

public class code39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1=sc.next();
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
		
			 boolean result=Arrays.equals(c1,c2);
			 if(result) {
					System.out.println("Anagram");
			 }
			 else {
					System.out.println("Not a Anagram");
			 }
		}
		else {
			System.out.println("Not a Anagram");
				 
		}
	}

}
