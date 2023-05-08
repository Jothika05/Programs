package part5;

import java.util.Scanner;

public class code45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array:");
	    int size=sc.nextInt();
	    
	    int[] n=new int[size];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n.length;i++) {
	    n[i]=sc.nextInt();
	    }
	    int max=n[0];
	    for(int i=0;i<size;i++) {
	    	if(n[i]>max)
	    	max=n[i];
	    }
	    System.out.println("Largest number is:"+max);
	    int min=n[0];
	    for(int i=0;i<size;i++) {
	    	if(n[i]<min)
	    	 min=n[i];
	    }
	    System.out.println("smallest number is:"+min);
	}

}
