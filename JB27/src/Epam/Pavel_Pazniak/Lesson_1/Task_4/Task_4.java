package Epam.Pavel_Pazniak.Lesson_1.Task_4;

import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x = 0;// 1-� �����
		double y = 0;// 2-� �����
		double g; // ����������
		double s;// �������
		System.out.print("������� x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
			};
		System.out.print("������� y: ");
		if (sc.hasNextDouble()) {
				y = sc.nextDouble();
				};
		g = Math.hypot(x, y);
		s = 0.5 * x * y;
		System.out.println("���������� = " + g);
		System.out.println("������� = " + s);
}
}
