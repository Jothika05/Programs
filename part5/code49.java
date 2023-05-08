package part5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class code49 {

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
	    int temp;
	    for(int i=0;i<n1.length;i++) {
	    	for(int j=i+1;j<n1.length;j++) {
	    		if(n1[i]>n1[j]) {
	    			temp=n1[i];
	    			n1[i]=n1[j];
	    			n1[j]=temp;
	    		}	
	    	  }
	    	}
	  
	    for(int i=0;i<n2.length;i++) {
	    	for(int j=i+1;j<n2.length;j++) {
	    		if(n2[i]<n2[j]) {
	    			temp=n2[i];
	    			n2[i]=n2[j];
	    			n2[j]=temp;
	    		  }	
	    	   }
	    	}
	    
	    		
	    int product=0;
	    for(int i=0;i<size1;i++) {
	         product=product+n1[i]*n2[i];
	         }
	    System.out.print(product);

}
}