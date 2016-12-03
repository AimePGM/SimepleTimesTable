package printstyle;

import java.util.Scanner;

import main.Process;

public class EachUnitPyramid implements PrintStyle{

	
	
	@Override
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input max of times table number: "); 
		int max = sc.nextInt();
		int unitNumber = 1;
		System.out.println("====================");
		System.out.println("\n\n");
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i+" "+Process.style.toString()+" "+j+" = "+i*j+"\t");
				unitNumber++;
				if(unitNumber == 3 || unitNumber == 6 || unitNumber == 10) System.out.println();
			}
			unitNumber = 1;
			
			System.out.println("\n");
		}
		
		
		
		
		
	}

}
