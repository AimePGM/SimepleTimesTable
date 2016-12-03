package main;

import printstyle.CenteredPyramid;
import printstyle.ColumnAndRow;
import printstyle.EachCenteredUnitPyramid;
import printstyle.EachUnitPyramid;
import printstyle.LeftPyramid;
import printstyle.OneColumn;
import printstyle.PrintStyle;
import timesStyle.TextStyle;
import timesStyle.TimesStyle;
import timesStyle.XStyle;

public class Process {
	
	public static TimesStyle style;
	private static PrintStyle print;

	public static void operate(int timesStyle, int printStyle) {
		if (timesStyle == 1){
			style = new XStyle();
		}
		else if (timesStyle == 2){
			style = new TextStyle();
		}
		
		if(printStyle == 1){
			print = new OneColumn();
		}
		else if(printStyle == 2){
			print = new ColumnAndRow();
		}
		else if(printStyle == 3){
			print = new LeftPyramid();
		}
		else if(printStyle == 4){
			print = new CenteredPyramid();
		}
		else if(printStyle == 5){
			print = new EachUnitPyramid();
		}
		else if(printStyle == 6){
			print = new EachCenteredUnitPyramid();
		}
		
		print.print();
		
		
		
		
	}
	

}
