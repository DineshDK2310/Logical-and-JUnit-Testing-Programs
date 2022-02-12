package logicalprograms;

import java.util.Scanner;

public class StartEndStopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start the stop watch");
		double startWatch=sc.nextDouble();

		startWatch=System.currentTimeMillis();

		System.out.println("Press 0 to stop the stop watch");
		double stopwatch=sc.nextDouble();
		stopwatch=System.currentTimeMillis();

		System.out.println("The Elapsed time is  "+((stopwatch-startWatch)/1000) + " seconds ");

		sc.close();

	}

}
