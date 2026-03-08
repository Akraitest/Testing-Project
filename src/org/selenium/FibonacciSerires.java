package org.selenium;

public class FibonacciSerires {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//0, 1,2,3,4,5,6,7,8
		int a = 0;
		int b = 1;
		for(int i = 2;i<=8; i++) {
			int c = a+b;
			a= b;
			b = c;
			System.out.println("fibbonacci series is"+ c);
		}
			
		

	}

}
