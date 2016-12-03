package printstyle;

import java.util.Scanner;

import main.Process;

public class CenteredPyramid implements PrintStyle{
	@Override
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input pyramid level: "); 
		int max = sc.nextInt();
		System.out.println("====================");
		System.out.println("\n\n");
		int i=1;
		int count = 1;
		int newLine = 0;
		do{
			int[] times = new int[count];
			for (int k = 0; k < times.length; k++) {
				times[k] = i;
				
				i++;
			}
			for (int k = 1; k < 10; k++) {
				for (int l = 0; l < times.length; l++) {
					if(newLine == 0){
						if(count < max){
							int tab = max-count;
							for (int j = 0; j < tab; j++) {
								System.out.print("\t");
							}
						}
						newLine = 1;
					}
					
					System.out.print(times[l]+" "+Process.style.toString()+" "+k+" = "+cal(times[l],k)+"\t");
		
				}
				System.out.println();
				newLine = 0;
				
			}
			System.out.println();	
			count++;
		}while(count <= max);
		
	}
	
	public int cal(int i, int j){
		return i*j;
		
	}

}
