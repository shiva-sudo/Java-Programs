package javatraining;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(); 
		int reverse = 0; 
		while(number != 0)
		{
		int remainder = number % 10;
		reverse = reverse * 10 + remainder;
		number = number/10;
		// 0  System.out.println (reverse);
		}

	}

}
