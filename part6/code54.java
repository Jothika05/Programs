package part6;
import java.util.Scanner;

public class code54 {

	static boolean Disjoint(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of first array:");
	    int size1=sc.nextInt();
	    System.out.println("Enter the size of second array:");
	    int size2=sc.nextInt();
	   
	    int[] arr1=new int[size1];
	    System.out.println("Enter the elements of first array:");
	    for(int i=0;i<arr1.length;i++) {
	    	arr1[i]=sc.nextInt();
	    }
	    
	    int[] arr2=new int[size2];
	    System.out.println("Enter the elements of second array:");
	    for(int i=0;i<arr2.length;i++) {
	    	arr2[i]=sc.nextInt();
	 
	    }
	    if(Disjoint(arr1,arr2)) 
	    	System.out.println("Disjoint");
	    else
	    		System.out.println(" not Disjoint");
	    } 
	
}
