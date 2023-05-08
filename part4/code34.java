package part4;

import java.util.Scanner;

public class code34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  String s1=s.replaceAll("[(){}]","");
  System.out.println(s1);

}
}
