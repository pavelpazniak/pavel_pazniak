1.
import java.util.Scanner;

class Test1 {
	int a = 0;
	int b = 0;

	void printResult() {
		System.out.println();
	}

	void edit(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите а: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		System.out.print("Введите b: ");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}
	}

	void summa(int a, int b) {
		int summa = a + b;
	}

	void max(int a, int b) {
		Math.max(a, b);
	}
}

2.
import java.util.Scanner;

class Test2 {
	int a;
	int b;

	void edit(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите а: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		System.out.print("Введите b: ");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}
	}

	Test2(int a, int b) {
		a = 0;
		b = 0;
	}

	int getA() {
		return a;
	}

	int getB() {
		return b;
	}

	int setA(int c) {
		int a = c;
	}

	int setB(int d) {
		int b = d;
	}

3.
class Student {
	String LastName;
	int GroupNumber;
	int marks;
}

public class Student1 {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student();
		students[0].LastName = "a";
		students[0].GroupNumber = 1;
		students[0].marks = 9;

		students[1] = new Student();
		students[1].LastName = "b";
		students[1].GroupNumber = 2;
		students[1].marks = 9;

		students[2] = new Student();
		students[2].LastName = "c";
		students[2].GroupNumber = 3;
		students[2].marks = 9;

		students[3] = new Student();
		students[3].LastName = "d";
		students[3].GroupNumber = 4;
		students[3].marks = 9;

		students[4] = new Student();
		students[4].LastName = "e";
		students[4].GroupNumber = 5;
		students[4].marks = 9;

		students[5] = new Student();
		students[5].LastName = "f";
		students[5].GroupNumber = 6;
		students[5].marks = 9;

		students[6] = new Student();
		students[6].LastName = "g";
		students[6].GroupNumber = 7;
		students[6].marks = 9;

		students[7] = new Student();
		students[7].LastName = "h";
		students[7].GroupNumber = 8;
		students[7].marks = 9;

		students[8] = new Student();
		students[8].LastName = "i";
		students[8].GroupNumber = 9;
		students[8].marks = 9;

		students[9] = new Student();
		students[9].LastName = "j";
		students[9].GroupNumber = 10;
		students[9].marks = 9;

	}


	int[] z = metod(marks);

	public static int[] metod(int[] marks) {
		int size = calc(marks);
		int[] students2 = new int[size];
		for (int i = 0; i > marks.length; i++) {
			if (marks[i] > 9) {
				students2[i] = marks[i];
				i++;
			}
		}
		return students2;
	}

	public static int calc(int[] marks) {
		int count = 0;
		for (int i = 0; i > marks.length; i++) {
			if (i == 9) {
				count++;
			}
			return count;

		}
	}
}



4.
class Train {
	String destination;
	String time;
	int number;
	private Train a;
	private Train b;
	private Train c;
	private Train d;
	private Train e;

	Train [] x = {a, b, c, d, e}; 
	
	int 
