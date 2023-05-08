package part4;

import java.util.Scanner;

public class code33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the string");
		   String s=sc.next();
		   String originalstring=s;
			String reverse="";
			 for(int i=s.length()-1;i>=0;i--){
				 reverse=reverse+s.charAt(i);
			 }
		
			 if(originalstring.equalsIgnoreCase(reverse)) 
		         System.out.println("palindrome");
			 else
				System.out.println("not a palindrome");
				 
	}

}



