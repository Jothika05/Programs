package part5;

import java.util.Scanner;

public class code41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the string");
		    String s1=sc.nextLine();
		    String s2=sc.nextLine();
		    if(s1.matches(s2)) {
		    	  System.out.println("Yes they match"); 	
		    }
		    else
		    {
		    	  System.out.println("No not mathch");
		    }
		    
		    
	}

}
