package printstyle;

import java.util.Scanner;

import main.Process;

public class EachCenteredUnitPyramid implements PrintStyle{
	
	@Override
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input max of times table number: "); 
		int max = sc.nextInt();
		int unitNumber = 1, tabCount = 2;
		boolean newLine = true;
		System.out.println("====================");
		System.out.println("\n\n");
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= 9; j++) {
				if(tabCount>0 && newLine == true){
					for (int k = 0; k < tabCount; k++) {
						System.out.print("\t");
					}
					newLine = false;
				}
				
				System.out.print(i+" "+Process.style.toString()+" "+j+" = "+i*j+"\t");
				unitNumber++;
				if(unitNumber == 3 || unitNumber == 6 || unitNumber == 10){
					System.out.println();
					tabCount--;
					newLine = true;
					
				}
			}
			
			unitNumber = 1;
			newLine = true;
			tabCount = 2;
			
			System.out.println("\n");
		}

	}
}
