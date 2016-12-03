package main;

import java.util.Scanner;


public class TimesTable {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int style = 0;
		
		System.out.print("Select Times Style \n1. 1 x 1 = 1\n2. 1 times 1 = 1\nPlease answer (1/2): ");
		while(style !=1 && style != 2){
			style = sc.nextInt();
			if (style !=1 && style != 2) {
				System.err.print("Don't trick me, only 1 or 2 ! answer: ");
			}
		}
		System.out.println("====================");
		int print = 0;
		System.out.print("Select Print Style \n1. one column\n2. two dimension (row and column)\n3. left side pyramid\n4. centered pyramid\n5. Each Unit Pyramid\n6. Each Centered Unit\nPlease answer (1/2/3/4/5/6): ");
		while(print !=1 && print != 2 && print != 3 && print != 4 && print != 5 && print != 6){
			print = sc.nextInt();
			if (print !=1 && print != 2 && print != 3 && print != 4 && print != 5 && print != 6) {
				System.err.print("Don't trick me, only 1 or 2 or 3 or 4 or 5 or 6! answer: ");
			}
		}
		System.out.println("====================");
		
		
		Process.operate(style, print);
		
	}
}


