package week1.day2;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LearningArrary {
	
	public static void main (String[] args) {
		
		int[] numbers ={1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};

		int count = 0;
		for (int i=0 ; i<numbers.length; i++) {
			
			if ( numbers[i]==5) {
				count = count+1;
				
			}
		}
		
	
	
	System.out.println("5 is present" +count+" " times")");
	}
			
}

