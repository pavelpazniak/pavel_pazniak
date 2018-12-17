package Epam.Pavel_Pazniak.Lesson_1.Task_5;

import java.util.Scanner;

public class Task_5 {	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = 0;
	int y = 0;
	int z = 0;
	int w = 0;
	int sum;
	System.out.print("¬ведите x: ");
	if (sc.hasNextInt()) {
		x = sc.nextInt();
		};
	System.out.print("¬ведите y: ");
	if (sc.hasNextInt()) {
		y = sc.nextInt();
		};
	System.out.print("¬ведите z: ");
	if (sc.hasNextInt()) {
		z = sc.nextInt();
		};
	System.out.print("¬ведите w: ");
	if (sc.hasNextInt()) {
		w = sc.nextInt();
		};;
	sum = x+y+z+w;
	System.out.println ("—умма = "+ sum +"");

}
}
