package part4;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class code38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
	    LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character, Integer>();
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
        Set<Map.Entry<Character, Integer>> entry=hm.entrySet();
        for(Map.Entry<Character, Integer> e:entry) {
         if(e.getValue()==1)
        	System.out.print(e.getKey());
        }
	}

}
