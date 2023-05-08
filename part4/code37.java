
package part4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class code37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
	    HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
	    char[] ch=s.toCharArray();
        for(char c:ch) {
	        if(hm.containsKey(c)){
	   		     hm.put(c,hm.get(c)+1);
	   	       }
	   	     else
	   	      {
	   		 hm.put(c, 1);
	   	      }
	      }
	
   
	     Set<Map.Entry<Character,Integer>> s1=hm.entrySet();
	     
	    for(Map.Entry<Character,Integer> entry:s1)  {
	   	    if(entry.getValue()>0)
	   	        System.out.println( "The Frequency of "+entry.getKey()+" is "+ entry.getValue());
	            }
		
	}
	
}

















