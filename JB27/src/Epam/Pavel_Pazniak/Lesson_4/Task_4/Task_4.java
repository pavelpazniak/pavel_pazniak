package Epam.Pavel_Pazniak.Lesson_4.Task_4;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
 System.out.println("Введи длину массива: ");
		int arrLength = readFromConsole();
		int [] arr = new int [arrLength];
		enterArrayWithRandom(arr);
		printArray(arr);
		indexOfZeroElemets(arr);		
	}
	
	public static void indexOfZeroElemets(int[] arr) {
		System.out.print("Номера нулевых элементов: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.print(i + " ");
			}
		}		
	}
	
	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()) {
			sc.next();
			System.out.println();
		}
		return (sc.nextInt());
	}
	
	public static void enterArrayWithRandom(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(2);
		}
		
	}
		
	public static void printArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		
	}
}