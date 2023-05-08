package part5;

import java.util.Scanner;
public class code48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of   array:");
	    int size=sc.nextInt();
	    
	    int[] n=new int[size];
	    System.out.print("Enter the elements:");
	    for(int i=0;i<size;i++) {
	    n[i]=sc.nextInt();
	    }
	    for(int i=0;i<n.length;i++) {
	    	for(int j=i+1;j<n.length;j++) {
	    		if(n[i]==n[j]) {
	    			n[i]=-1;
	    		}
	    	}
	    }
	     for(int i=0;i<n.length;i++) { 
	      if(n[i]!=-1) {
		    System.out.println(n[i]+" ");
	       }
	    }
	    
	}
}
	    
	    
	    
	