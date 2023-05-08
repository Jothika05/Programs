package part3;

import java.util.Scanner;

public class code24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
		System.out.println();
		}
	}


	}

