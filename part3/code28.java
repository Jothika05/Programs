package part3;

import java.util.Scanner;

public class code28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String str=sc.next();
		 String reverse="";
		 for(int i=str.length()-1;i>=0;i--){
			 reverse=reverse+str.charAt(i);
		 }
		System.out.println(reverse);
	}

}
