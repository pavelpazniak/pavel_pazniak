package Epam.Pavel_Pazniak.Lesson_3.Task_1_6;

import java.util.Scanner;

public class Task_1_6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = 0;
	int poslZifra;
	int poslZifraKv;
	System.out.print("������� �����: ");
	if (sc.hasNextInt()) {
	number = sc.nextInt();
	}
	poslZifra = number % 10;
	switch (poslZifra) {
	case 0:
	poslZifraKv = 0;
	break;
	case 1:
	poslZifraKv = 1;
	break;
	case 2:
		poslZifraKv = 4;
		break;
		case 3:
		poslZifraKv = 9;
		break;
		case 4:
		poslZifraKv = 6;
		break;
		case 5:
		poslZifraKv = 5;
		break;
		case 6:
		poslZifraKv = 6;
		break;
		case 7:
		poslZifraKv = 9;
		break;
		case 8:
		poslZifraKv = 4;
		break;
		case 9:
		poslZifraKv = 1;
		break;
		default:
		System.out.println("���-�� �� �� � ����������.");
		return;
		}
		System.out.println("������� ����� " + number + " ��������� " +
		poslZifraKv);
}
public static int ReadFromConsole(String[] args)  {
	Scanner sc = new Scanner(System.in);
	if (sc.hasNextInt()) {
		return (sc.nextInt());
	} else return 0;
}
}
