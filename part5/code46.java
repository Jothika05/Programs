package part5;

import java.util.Scanner;

public class code46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of   array:");
	    int size=sc.nextInt();
	    
	    int[] n=new int[size];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n.length;i++) {
	    n[i]=sc.nextInt();
	    }
	    
	    for(int i=0;i<size;i++) {
	        sum=sum+n[i];
	    }
	  
		System.out.println(sum);
	}
}
