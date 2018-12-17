package Epam.Pavel_Pazniak.Lesson_4.Task_2;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
	int result = 0;
	System.out.println("Введи длину массива: ");
	int n = readFromConsole();
	
	System.out.println("Введи К: ");
	int k = readFromConsole();
	
	int[] a = new int[n];
	enterArrayWithRandom(a);
	printArray(a);
	

	for (int i = 0; i < a.length; i++) {
		if (a[i] % k == 0) {
			result += a[i];
		}
	}
	System.out.println("Результат = " + result);
}

public static void enterArrayWithRandom(int[] mas) {
	Random rand = new Random();
	for (int i = 0; i < mas.length; i++) {
		mas[i] = rand.nextInt(1000);
	}
}

public static int readFromConsole() {
	Scanner sc = new Scanner(System.in);
	while (!sc.hasNextInt()) {
		sc.next();
		System.out.println();
	}
	return (sc.nextInt());
}

public static void printArray(int[] mas) {
	System.out.print("[ ");
	for (int i = 0; i < mas.length; i++) {
		System.out.print(mas[i] + " ");
	}
	System.out.print("]" + "\n");

}
}