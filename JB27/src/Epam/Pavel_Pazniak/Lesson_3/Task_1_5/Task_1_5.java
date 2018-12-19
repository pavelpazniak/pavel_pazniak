package Epam.Pavel_Pazniak.Lesson_3.Task_1_5;

import java.util.Scanner;

public class Task_1_5 {
	public static void main(String[] args) {
	int n = 10;
	Scanner sc = new Scanner(System.in);
	String max = "", min = "", str = "";
	for (int i = 0; i < n; i++) {
	System.out.print("> ");
	if (sc.hasNextLine()) {
	str = sc.nextLine();
	if (i == 0) {
	min = str;
	}
	if (str.length() > max.length()) {
	max = str;
	}
	}
	}
	System.out.println("max string = " + max + " length=" +
	max.length());
	}

public static void main1(String[] args) {
int n = 10;
Scanner sc = new Scanner(System.in);
String max = "", min = "", str = "";
for (int i = 0; i < n; i++) {
System.out.print("> ");
if (sc.hasNextLine()) {
str = sc.nextLine();
if (i == 0) {
min = str;
} if (str.length() < min.length()) {
min = str;
}
}
}
System.out.println ("min string = " + min + " length=" +
min.length());
}
}
