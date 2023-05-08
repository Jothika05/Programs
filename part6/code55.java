package part6;

import java.util.Arrays;
import java.util.Scanner;

public class code55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size  array:");
	    int n=sc.nextInt();

	  
	   
	    int[] n1=new int[n];
	    System.out.println("Enter the elements of first array:");
	    for(int i=0;i<n1.length;i++) {
	    	n1[i]=sc.nextInt();
	    }
	    
	    int[] n2=new int[n];
	    System.out.println("Enter the elements of second array:");
	    for(int i=0;i<n2.length;i++) {
	    	n2[i]=sc.nextInt();
	    }
	    Arrays.sort(n1);
	    Arrays.sort(n2);
	    int product=0;
	    for(int i=0;i<n;i++) {
	         product=product+n1[i]*n2[i];
	         }
	    System.out.print(product);


	    
	    
	}

}
