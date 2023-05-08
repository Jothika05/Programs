package part4;

import java.util.Scanner;

public class code40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String s=sc.nextLine();
    System.out.println("Enter the substring to be removed");
    String oldsubstring=sc.nextLine();
    
    System.out.println("Enter the new  substring");
    String newsubstring=sc.nextLine();
    
    
    String modifystring=s.replaceAll(oldsubstring, newsubstring);
    System.out.println("The new string: ");
    System.out.print(modifystring);
   
    
	}

}
