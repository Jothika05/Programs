package part2;

import java.util.Scanner;

public class code14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int num=sc.nextInt();
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		
		System.out.println("Reverse number is "+rev);
	}

}
//675  
//rem=675%10=5    //rem=67%10=7       //rem=6%10=6
//rev=0*10+5=5    //rev=5*10+7=57   //rev=57*10+6=576
//num=675/10=67   //num=67/10=6        //num=6/10=0

