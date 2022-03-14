package com.Mock;

import java.util.Scanner;

public class Countofchar {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter the Word");
		String word = sc.nextLine();
		System.out.println("now enter the letter which has to be counted");
		char ch = sc.next().charAt(0);
		for(int i=0,limit =word.length();i<limit;i++) {
			if(word.charAt(i) == ch) 
			{
				count++;
			}
		}
		
		System.out.println("The character " + ch + " occured " + count + " number of times.");
	}
	

}
