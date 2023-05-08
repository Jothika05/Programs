package part4;

import java.util.Scanner;


public class code32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the string");
		   String s=sc.nextLine();
		   for(int i=0;i<s.length();i++) {
		   char ch=s.charAt(i);
		   if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O'||ch=='U' ||ch=='a'||ch=='e' ||ch=='i'||ch=='o' ||ch=='u') 
			   continue; 
		   else
			   System.out.print(s.charAt(i)) ; 
		   
	     }

}
} 