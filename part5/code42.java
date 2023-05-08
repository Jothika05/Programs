package part5;

import java.util.Arrays;
import java.util.Scanner;

public class code42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of first array:");
	    int size1=sc.nextInt();
	    System.out.println("Enter the size of second array:");
	    int size2=sc.nextInt();
	   
	    int[] n1=new int[size1];
	    System.out.println("Enter the elements of first array:");
	    for(int i=0;i<n1.length;i++) {
	    	n1[i]=sc.nextInt();
	    }
	    
	    int[] n2=new int[size2];
	    System.out.println("Enter the elements of second array:");
	    for(int i=0;i<n2.length;i++) {
	    	n2[i]=sc.nextInt();
	 
	    }
	
	    	if(Arrays.equals(n1, n2)) { 
	    		System.out.print("Same");
	    	}
	    	else
	    	{
	    		System.out.print("Not Same");
	    	 }
	      
	    
	}

}
