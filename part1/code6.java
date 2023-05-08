package part1;

import java.util.Scanner;

public class code6 {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("enter the x and  ycoordinates");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			if(num1>0 &&num2>0)  //+,+
				System.out.println("This point lies in First  quadrant");
			else if(num1>0 && num2<0)//+,-
				System.out.println("This point lies in second  quadrant");
			else if(num1<0 && num2<0)//-,-
				System.out.println("This point lies in third  quadrant");
			else if(num1<0 && num2>0)//-,+
				System.out.println("This point lies in fourth quadrant");
			else
			System.out.println("This point lies at the origin");
			
	}

}
