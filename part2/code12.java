package part2;

import java.util.Scanner;

public class code12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int n=sc.nextInt();
		int sum=0,rem;
		while(n!=0) {
		    rem=n%10; 
		    sum=sum+rem; 
		    n=n/10;
			   }
		System.out.println("Sum of digits is "+ sum);
		}
	}

//45
//rem=45%10=5   //rem=4%10=4
//sum=0+5=5     //sum=5+4=9
//45/10=4  
