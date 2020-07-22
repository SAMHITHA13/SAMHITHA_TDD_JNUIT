package com.epam.TDD_JUNIT;
import java.util.*;
public class RemoveA {
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String");
   String s=sc.next();
   String res="";
   int n=s.length();
   if(s.charAt(0)!='A')
	   res=res+s.charAt(0);
   if(s.charAt(1)!='A')
	   res=res+s.charAt(1);
   res=res+s.substring(2,n);
   System.out.println("String after removing A in first two places:");
   System.out.println(res);
}
}
