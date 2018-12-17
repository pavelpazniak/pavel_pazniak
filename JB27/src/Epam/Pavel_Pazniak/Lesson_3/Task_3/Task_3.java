package Epam.Pavel_Pazniak.Lesson_3.Task_3;

import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = 0, Fx;
		System.out.print("¬ведите x: ");
		if (sc.hasNextDouble()) {
		x = sc.nextDouble();
		} 
		if (x <= (-3))
		{Fx = 9 ; System.out.println("Fx = " + Fx);
	    };
	    if (x > 3)
	    {Fx = 1 / (Math.pow(x, 2) + 1);
		System.out.println("Fx = " + Fx);
	    }
	}
}
