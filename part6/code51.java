package part6;

import java.util.Arrays;
import java.util.Scanner;

public class code51 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of   array:");
	    int size=sc.nextInt();
	    
	    int[] n=new int[size];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n.length;i++) {
	    n[i]=sc.nextInt();
	    }
	    int temp;
	    for(int i=0;i<n.length;i++) {
	    	for(int j=i+1;j<n.length;j++) {
	    		if(n[i]>n[j]) {
	    			temp=n[i];
	    			n[i]=n[j];
	    			n[j]=temp;
	    		}	
	    	  }
	    	}
	    System.out.println("Sorted elements are:");
	    for(int i=0;i<n.length;i++) {
	    System.out.println(n[i]);
	    }	
	    }
	    }

