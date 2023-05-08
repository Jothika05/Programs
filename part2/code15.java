package part2;

import java.util.Scanner;

public class code15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int n=sc.nextInt();
		int originalnumber=n; //o=145
	     while(n>0) {
			rem=n%10;   //145%10  
			System.out.println("Remainder: "+rem); //5
			int fact=1;
			for(int i=1;i<=rem;i++) {// 5,4,3,2,1
				fact=fact*i; //120
			}
			System.out.println("factorial: "+fact);
			sum=sum+fact; //0+120
			n=n/10;
			System.out.println("sum is:  "+sum);
		}
		if(originalnumber==sum) {
			System.out.println(originalnumber + " is Strong number");
		}
		else {
			System.out.println(originalnumber + " is  not a Strong number");
		}
	} 

}

