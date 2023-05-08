package part4;

import java.util.Scanner;

public class code35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0,count=0;
       for(int i=0;i<s.length();i++) {
	   char ch=s.charAt(i);
	         if(ch>='0'&& ch<='9') {
	           sum=sum+ch-'0';
                 count++;
	   }
	
   }
   System.out.println("no of digits: "+count);

   System.out.println("sum of digits: " +sum);	  
	}

}

