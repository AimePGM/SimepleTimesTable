package printstyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.Process;

public class ColumnAndRow implements PrintStyle{

	

	@Override
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input max of times table number: "); 
		int max = sc.nextInt();
		System.out.println("====================");
		System.out.print("How many column do you want: ");
		int col = sc.nextInt();
		System.out.println("====================");
		System.out.println("\n\n");
		
		List<Integer> tableList = new ArrayList<Integer>();
		int[] times = new int[col];
		int i=1;
		int j = 1;
		do{
			for (int k = 0; k < times.length; k++) {
				times[k] = i;
				
				i++;
			}
			for (int k = 1; k < 10; k++) {
				for (int l = 0; l < times.length; l++) {
					if(times[l]<=max)
				
					System.out.print(times[l]+" "+Process.style.toString()+" "+k+" = "+cal(times[l],k)+"\t");
		
				}
				System.out.println();
				
			}
			System.out.println();		
			
		}while(i <= max);
		
	}
	
	public int cal(int i, int j){
		return i*j;
		
	}

}
