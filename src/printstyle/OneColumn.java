package printstyle;

import java.util.Scanner;

import main.Process;

public class OneColumn implements PrintStyle{

	
	@Override
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input max of times table number: "); 
		int max = sc.nextInt();
		System.out.println("====================");
		System.out.println("\n\n");
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+" "+Process.style.toString()+" "+j+" = "+i*j);
			}
			System.out.println();
		}
		
	}
	
	

}
