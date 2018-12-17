package Epam.Pavel_Pazniak.Lesson_2.Task_2;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double d;
		System.out.print("¬ведите a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
			}
		System.out.print("¬ведите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
			}
		System.out.print("¬ведите c: ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
			}

		double temp;
			
		{	temp = 2 * a;
				if (temp != 0) {
			d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)/ temp) - (Math.pow(a, 3) * c) + b;
		} else {
		System.out.println("«наменатель равен нулю.");
		d = Double.NaN;
		}
		System.out.println("d=" + d);
		}

}
}
