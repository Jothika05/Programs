package part5;

import java.util.Scanner;

public class code44 {

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
	    int odd=0,even=0;
	    for(int i=0;i<size;i++) {
	        if(n[i]%2==0) 
	        	even++;
	        else
	          odd++;		
	        }
	   System.out.println("Number of even elements:\n"+even);
	   System.out.println("Number of odd elements:\n"+odd);
	}
	

}
