package Epam.Pavel_Pazniak.Lesson_3.Task_2;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.print("¬ведите a: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			};
		for (int i = 0; i < a; i++){
			double Fx;
			Fx = 2 * Math.tan(i/2) + 1;
		    System.out.println ("«начение Fx = " + Fx);
		}
	}
}

