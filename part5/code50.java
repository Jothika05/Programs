package part5;

import java.util.Scanner;

public class code50 {

	public static void main(String[] args) {
	
		int sum=0,square=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of   array:");
	    int size=sc.nextInt();
	    
	    int[] n=new int[size];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n.length;i++) {
	    n[i]=sc.nextInt();
	    }
	    for(int i=0;i<n.length;i++) {
	       square=n[i]*n[i];
	       sum=sum+square;
         }
	   
	    System.out.println(sum);
	}

}
