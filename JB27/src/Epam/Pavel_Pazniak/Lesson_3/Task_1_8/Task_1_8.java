package Epam.Pavel_Pazniak.Lesson_3.Task_1_8;

import java.util.Scanner;

public class Task_1_8 {
	public static void main(String[] args) {
	int number = 0;
	int digit = 0;
	System.out.print("������� �����: ");
	number = readFromConsole();
	while (number != 0) {
	digit = number % 10;
	number = number / 10;
	if (digit % 2 == 0) {
	System.out.println("� ����� ���� ������ �����.");
	return;
	}
	}
	System.out.println("� ����� ��� ������ ����.");
	}

private static int readFromConsole() {
Scanner sc = new Scanner(System.in);
if (sc.hasNextInt()) {
	return (sc.nextInt());
} else
return 0;
}
}
