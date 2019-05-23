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
			b = sc.nextInt();}
		}


}

public class Student1{
	public static void main(String [] args) {
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
	}}

public class Student1{
	public static void main(String[]args) {
		Test2 z = new Test2(5,6);
		z.setA(9);
		System.out.println(z.getA());
	}
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
}

 class sadsasd{

		Train[] schedule = new Train[5];
		schedule[0] = new Train();
		schedule[0].destination = "a";
		schedule[0].time = "10:00";
		schedule[0].number = 1;

		schedule[1] = new Train();
		schedule[1].destination = "b";
		schedule[1].time = "11:00";
		schedule[1].number = 2;

		schedule[2] = new Train();
		schedule[2].destination = "c";
		schedule[2].time = "12:00";
		schedule[2].number = 3;

		schedule[3] = new Train();
		schedule[3].destination = "d";
		schedule[3].time = "13:00";
		schedule[3].number = 4;

		schedule[4] = new Train();
		schedule[4].destination = "e";
		schedule[4].time = "14:00";
		schedule[4].number = 5;

5.
6.
7.
class Triangle {
    int Fa; // первый катет
    int Fb; // второй катет
    int Fc; // гипотенуза
    double S; // площадь
    double P; // периметр
    public Triangle(int a, int b, int c){
        Fa = a;
        Fb = b;
        Fc = c;
    }
    double getP(){
        P = Fa + Fb + Fc;
        return P;
    }
    double getS(){
        int p, x;
        p = (int) (P/2);
        x = p*(p-Fa)*(p-Fb)*(p-Fc);
        S = Math.sqrt(x);
        return S;
    }
}

public class sadsasd {
    public static void main(String[] args){
        Triangle trng = new Triangle(7,8,4);
        double y,z;
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
    int bank;//номер банковского счета
    
    Customer (int a , String b, String c, String d, int e, int f){
    	this.id = a;
    	this.Name = b;
    	this.Surname = c;
    	this.Address = d;
    	this.cc = e;
    	this.bank = f;
    }
    
    void getList(){
        System.out.println(id);
    }
    
    void getCC() {
    	
        	
        }
    }


public class sadsasd {
    public static void main(String[] args){
		Customer xxx = new Customer(111,"aaa","ccc","ddd",222,333);
		Customer yyy = new Customer(111,"aaa","ccc","ddd",222,333);
		Customer zzz = new Customer(111,"aaa","ccc","ddd",222,333);
    	

    	int y,z;
        y = customers.getList();
        z = customers.getCC;
        System.out.println(y);
        System.out.println(z);
                        
    }
}


9.

class Book {
    int id; // ID книги
    String Name; // название
    String Editor; // издательство
    String Author; // автор
    int year; // год 
    int pages;//количество страниц
    int price; // цена
    int type;//тип переплета
    
    Book (int a , String b, String c, String d, int e, int f, int g, int h){
    	this.id = a;
    	this.Name = b;
    	this.Editor = c;
    	this.Author = d;
    	this.year = e;
    	this.pages = f;
    	this.price = g;
    	this.type = h;
    }
    
    void author(){
        System.out.println(id);
    }
    
    void editor() {
    	
    }
    void year() {
    	
        	
        }
    }


public class sadsasd {
    public static void main(String[] args){
    	Book [] books = new Book[3];
		books [0] = new Book(111,"aaa","ccc","ddd",222,333,444,555);
		books [1] = new Book(111,"aaa","ccc","ddd",222,333,444,555);
		books [2] = new Book(111,"aaa","ccc","ddd",222,333,444,555);

    	int y,z,x;
        y = books.author();
        z = books.editor();
        x = books.year()
        		
        System.out.println(y);
        System.out.println(z);
        System.out.println(x);
                        
    }
}

