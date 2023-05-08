package part3;

import java.util.Scanner;

public class code26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:");
   int N=sc.nextInt();
   int total=N*(N-1)/2;
   System.out.println(total);	   
	}

}
