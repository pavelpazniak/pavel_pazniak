package Epam.Pavel_Pazniak.Lesson_4.Task_3;

import java.util.Scanner;

public class Task_3 {
public static void main(String[] args) {

	    int [] arr = new int [] {120, 140, 178, 205, 300};
		boolean result = true;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				result = false;
				break;
			}
		}
		 if (result == false) {
			 System.out.println("Последовательность чисел является убывающей или невозрастающей");
		 } else {
			 System.out.println("Последовательность чисел является возрастающей");

		
}
}
}
