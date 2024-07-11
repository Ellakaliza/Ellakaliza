package a1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Oddonacci_Multiple {
	
	public static long Oddonacci(int n) {
		//the first three numbers in the algorithm are set to 1
		if(n<=3)
			return 1;
		else {
			//if the the number input is not 3 or less, then the method calculates the oddonacci number recursively
			return Oddonacci(n-1)+Oddonacci(n-2)+Oddonacci(n-3);
		}
	}

	public static void main(String[] args) {
		int n=200;
		int counter=5;
		PrintWriter outputStream;
		try {
			outputStream = new PrintWriter(new FileWriter("OddoOut.txt",true));
			outputStream.println("Multiple recursive");
			outputStream.println();	
			while(counter<=n) {
				long startTime = System.nanoTime();
				outputStream.println(Oddonacci(counter));
				long endTime = System.nanoTime();
		        long totalTime = endTime - startTime;
		        outputStream.println("Multiple Oddonacci("+counter+") Execution Time: " + totalTime + " nanoseconds");
				counter+=5;
			}
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
