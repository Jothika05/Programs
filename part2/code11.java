package part2;

import java.util.Scanner;

public class code11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int num=sc.nextInt();
		int a=-1,b=1,c;
		for(int i=1;i<=num;i++) {   
		c=a+b;                      
		System.out.println(c);
		a=b;
		b=c;
	}

}
}

// a b   c=a+b        
//-1 1    0
//1+0     1
//0+1     1
//1+1     2