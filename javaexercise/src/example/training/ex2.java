package example.training;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex2 {

	public static void main(String[] args) {
		String str = null;
		
		 Scanner sc=new Scanner(System.in);
		   
	     System.out.println("enter your name:");
	          String name= sc.next();		
		if (Pattern.matches("[a-zA-Z]+",str)) {
		  System.out.println("Yes, string contains letters only");
		}
		else{
		  System.out.println("Nope, Other characters detected");    
		}
	}

}
