package org.selenium;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12345;
	    int rem = 0;
	    int rev = 0;
	    
		while(a>0) {
			rem = rem%10;
			rev = rev*10 + rem;
			a = a%10;
		}
         System.out.println(rev);
	}

}
