1.
import java.util.Scanner;

class Test1 {
	int a;
	int b;

	void print() {
		System.out.println(a + " " + b);
	}

	void summa() {
		System.out.println(a + b);
	}

	void max() {
		System.out.println(Math.max(a, b));
	}

	void edit() {
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

}

public class Student1 {
	public static void main(String[] args) {
		Test1 e = new Test1();
		e.edit();
		e.print();
		e.summa();
		e.max();
	}
}



2.
class Test2 {
	int a;
	int b;

	Test2() {

	}

	Test2(int a, int b) {
		this.a = 5;
		this.b = 0;
	}

	int getA() {
		return a;
	}

	int getB() {
		return b;
	}

	void setA(int c) {
		this.a = c;
	}

	void setB(int d) {
		this.b = d;
	}
}

public class Student1 {
	public static void main(String[] args) {
		Test2 z = new Test2(5, 6);
		z.setA(9);
		System.out.println(z.getA());
	}
}


3.
class Student {
	String LastName;
	int GroupNumber;
	int marks;

	Student(String a, int b, int c) {
		this.LastName = a;
		this.GroupNumber = b;
		this.marks = c;
	}

	public int getMarks() {
		return marks;
	}
}

public class Student1 {
	public static void main(String[] args) {
		Student[] Array = new Student[10];
		Array[0] = new Student("ac", 5, 10);
		Array[1] = new Student("ac", 5, 1);
		Array[1] = new Student("ac", 5, 1);
		Array[2] = new Student("ac", 5, 1);
		Array[3] = new Student("ac", 5, 1);
		Array[4] = new Student("ac", 5, 1);
		Array[5] = new Student("ac", 5, 1);
		Array[6] = new Student("ac", 5, 1);
		Array[7] = new Student("ac", 5, 1);
		Array[8] = new Student("ac", 5, 1);
		Array[9] = new Student("ac", 5, 1);
	}

	public static Student[] metod(Student[] Array) {
		int size = calc(Array);
		int a = Array.getMarks();
		Student[] Array2 = new Student[size];
		for (int i = 0; i > Array.length; i++) {
			if (a > 0) {
				Array2[i] = Array[i];
				i++;
			}
		}
		return Array2;
	}

	public static int calc(Student[] Array) {
		int count = 0;
		int a = Array.getMarks;
		for (int i = 0; i > Array.length; i++) {
			if (a > 0) {
				count++;
			}
			return count;

		}
	}
}


4.
import java.util.Scanner;

class Train {
	String destination;
	String time;
	int number;

	Train(String a, String b, int c) {
		this.destination = a;
		this.time = b;
		this.number = c;
	}

	void info() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите а: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		System.out.println();
	}

	int[] sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int max_index = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
					max_index = j;
				}
			}
			if (i != max_index) {
				int a = nums[i];
				nums[i] = nums[max_index];
				nums[max_index] = a;
			}
		}
		return nums;
	}
}

public class Student1 {
	public static void main(String [] args) {
			Train[] trains = new Train[5];
			trains[0] = new Train("a" , "15:00" , 1);
			trains[1] = new Train("b" , "16:00" , 2);
			trains[2] = new Train("c" , "17:00" , 3);
			trains[3] = new Train("d" , "18:00" , 4);
			trains[4] = new Train("e" , "19:00" , 5);
			
			trains.info();
	 }



7.
class Triangle {
	int Fa; // первый катет
	int Fb; // второй катет
	int Fc; // гипотенуза
	double S; // площадь
	double P; // периметр

	public Triangle(int a, int b, int c) {
		Fa = a;
		Fb = b;
		Fc = c;
	}

	double getP() {
		P = Fa + Fb + Fc;
		return P;
	}

	double getS() {
		int p, x;
		p = (int) (P / 2);
		x = p * (p - Fa) * (p - Fb) * (p - Fc);
		S = Math.sqrt(x);
		return S;
	}
}

public class sadsasd {
	public static void main(String[] args) {
		Triangle trng = new Triangle(7, 8, 4);
		double y, z;
		y = trng.getP();
		z = trng.getS();
		System.out.println(y);
		System.out.println(z);

	}
}


8.
class Customer {
	int id; // ID клиента
	String Name; // имя
	String Surname; // фамилия
	String Address; // адрес
	int cc; // номер карточки
	int bank;// номер банковского счета

	Customer(int a, String b, String c, String d, int e, int f) {
		this.id = a;
		this.Name = b;
		this.Surname = c;
		this.Address = d;
		this.cc = e;
		this.bank = f;
	}

	@Override
	public String toString() {
		return this.id + " " + this.Name + " " + this.Surname + " " + this.Address + " " + this.cc + " " + this.bank;
	}

	int getCC() {
		if (cc < 4) {
			System.out.println(cc);
		}
		return cc;
	}
}

public class sadsasd {
	public static void main(String[] args) {
		Customer[] all = new Customer[5];
		all[0] = new Customer(1, "a", "b", "c", 0, 3);
		all[1] = new Customer(2, "b", "b", "c", 1, 3);
		all[2] = new Customer(3, "c", "b", "c", 2, 3);
		all[3] = new Customer(4, "d", "b", "c", 3, 3);
		all[4] = new Customer(5, "e", "b", "c", 6, 3);

		for (int i = 0; i < all.length; i++) {
			all[i].getCC();
			all[i].toString();
		}
	}
}

9.

import java.util.Scanner;

class Book {
	int id; // ID книги
	String Name; // название
	String Editor; // издательство
	String Author; // автор
	int year; // год
	int pages;// количество страниц
	int price; // цена
	int type;// тип переплета

	Book(int a, String b, String c, String d, int e, int f, int g, int h) {
		this.id = a;
		this.Name = b;
		this.Editor = c;
		this.Author = d;
		this.year = e;
		this.pages = f;
		this.price = g;
		this.type = h;
	}

	@Override
	public String toString() {
		return this.id + " " + this.Name + " " + this.Editor + " " + this.Author + " " + this.year + " " + this.pages
				+ " " + this.price + " " + this.type;
	}

	void author() {
		if (Author == this.Author) {
			System.out.println(toString());}
	}

	void edit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите Author: ");
		if (sc.hasNext()) {
			Author = sc.next();
		}
	}

}
public class sadsasd {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book(111, "aaa", "ccc", "ddd", 222, 333, 444, 555);
		books[1] = new Book(111, "aaa", "ccc", "sss", 222, 333, 444, 555);
		books[2] = new Book(111, "aaa", "ccc", "zzz", 222, 333, 444, 555);
		
		for (int i = 0; i < books.length;i++) {
			books[i].edit();
			books[i].author();
		}
	}
}

10.
import java.util.Scanner;

class Airline {
	int number;
	String destination;
	String type;
	String time;
	String days;

	Airline(int a, String b, String c, String d, String e) {
		this.number = a;
		this.destination = b;
		this.type = c;
		this.time = d;
		this.days = e;
	}

	@Override
	public String toString() {
		return this.number + " " + this.destination + " " + this.type + " " + this.time + " " + this.days;
	}

	void destination() {
		if (destination == this.destination) {
			System.out.println(toString());
		}
	}

	void typeDestination() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите destination: ");
		if (sc.hasNext(this.destination)) {
			this.destination = sc.next();
		} else
			System.out.println("error");
	}
}

public class sadsasd {
	public static void main(String[] args) {
		Airline[] planes = new Airline[3];
		planes[0] = new Airline(1, "Minsk", "big", "15:00", "monday");
		planes[1] = new Airline(2, "London", "small", "16:00", "friday");
		planes[2] = new Airline(3, "Paris", "medium", "17:00", "saturday");

		for (int i = 0; i < planes.length; i++) {
			planes[i].typeDestination();
			planes[i].destination();
		}
	}
}
