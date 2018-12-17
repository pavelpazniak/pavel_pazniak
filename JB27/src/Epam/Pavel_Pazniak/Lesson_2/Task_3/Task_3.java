package Epam.Pavel_Pazniak.Lesson_2.Task_3;

import java.util.Scanner;

public class Task_3 {	
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	   {
	      System.out.print("Введите радиус: ");
	      double radius = sc.nextDouble();
	      double ploshchad = Math.PI * Math.pow(radius, 2);
	      System.out.println("Площадь круга равна: " + ploshchad);
	      double dlina= Math.PI * 2 * radius;
	      System.out.println("Длины окружности равна: " + dlina);
}

}
}