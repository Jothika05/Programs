package part6;


import java.util.Scanner;

public class code52 {

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
	    	 
	   for(int i=n.length-1;i>=0;i--) {
		   System.out.print( n[i]);
		    }
	   
	}

}
