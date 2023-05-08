package part5;

import java.util.Arrays;
import java.util.Scanner;

public class code47 {
public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of   array:");
	    int size=sc.nextInt();
	    
	    int[] n=new int[size];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n.length;i++) {
	    n[i]=sc.nextInt();
	    
	    }
	    
	    int longestPalindrome = 0;
	    for (int number : n) {
	      if (isPalindrome(number) && number > longestPalindrome) {
	        longestPalindrome = number;
	      }
	    }
     System.out.println("Longest palindrome number: " + longestPalindrome);
	  }

	  public static boolean isPalindrome(int number) {
		int reversed = 0;
	    int original = number;

	    while (number > 0) {
	      int lastDigit = number % 10;
	      reversed = (reversed * 10) + lastDigit;
	      number /= 10;
	    }
	    return reversed == original;
	  }

	}
