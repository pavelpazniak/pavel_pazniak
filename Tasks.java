package pavel.pazniak.java.tasks;

1.
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 16, 20, 30, 65, 80 };
		int k = readIntFromConsole("Введите k ");
		int c = metod(k, nums);
		printResult(c);
	}

	public static int readIntFromConsole(String message) {
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		k = sc.nextInt();
		return k;
	}

	public static int metod(int k, int nums[]) {

		int c = 0;
		int d = 0;
		for (int i : nums) {
			c = i / k;
			if (i % k == 0)
				d += i;
		}
		return d;
	}

	public static void printResult(int d) {
		System.out.println("c = " + d);
	}

}

2.
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 0, 120, 0, 65, 0, 0, 0 };
		int[] results;
		results = metod(nums);
		printResult(results);
	}

	public static int[] metod(int[] nums) {
		int size = calc(nums);
		int index = 0;
		int[] mas = new int[size];
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 0) {
				mas[index] = i;
				index++;
			}
		return mas;
	}

	public static int calc(int nums[]) {
		int count = 0;
		for (int i : nums) {
			if (i == 0)
				count++;
		}
		return count;

	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}
3.
public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 0, 22, 30, 11, 80, -12, -99 };
		int max = max(nums);
	}

	public static int max(int[] nums) {
		int b = 0;
		for (int i : nums) {
			if (i > 0) {
				b = i;
				System.out.println(b + " Первым встречается положительное число");
				break;
			} else if (i < 0) {
				b = i;
				System.out.println(b + " Первым встречается отрицательное число");
				break;
			} else {
				b = i;
				System.out.println(b + " Первым встречается нуль");
				break;
			}
		}
		return b;
	}
}

4.
public class HelloWorld {
	public static void main(String[] args) {

		int[] nums = new int[] { 10, 15, 20, 25, 60 };
		boolean result = true;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				result = false;
				break;
			}
		}

		if (result == false)
			System.out.println("Последовательность чисел не возрастающая");
		else {
			System.out.println("Последовательность чисел возрастающая");
		}
	}
}

5.
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 120, 65, 10, 60, 70 };
		int[] results;
		results = metod(nums);
		printResult(results);
	}

	public static int[] metod(int[] nums) {
		int size = calc(nums);
		int index = 0;
		int[] mas = new int[size];
		for (int i : nums)
			if (i % 2 == 0) {
				mas[index] = i;
				index++;
			}
		return mas;
	}

	public static int calc(int nums[]) {
		int count = 0;
		for (int i : nums) {
			if (i % 2 == 0) {
				count++;
			}
		}
		return count;

	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}

6.
public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { -17, 22, 30, 11, 80 };
		int max = nums[0];
		int min = nums[0];
		max = max(nums, max);
		min = min(nums, min);
		printDlina(min, max);
	}

	public static int max(int[] nums, int max) {
		for (int i = 0; i < nums.length; i++) {
			if (max > nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}

	public static int min(int[] nums, int min) {
		for (int i = 0; i < nums.length; i++) {
			if (min < nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}

	public static void printDlina(int min, int max) {
		System.out.println("Длина числовой оси = " + Math.abs(min - max));
	}
}


7.
import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int a = readIntFromConsole("Введите a ");
		int[] nums = { 1, 2, 3, 4, 10, 60, 70 };
		int[] results;
		int b = calc(nums, a);
		results = metod(nums, a);
		printResult(results, b);
	}

	public static int readIntFromConsole(String message) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		x = sc.nextInt();

		return x;
	}

	public static int[] metod(int[] nums, int a) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > a) {
				nums[i] = a;
			}
		;
		return nums;
	}

	public static int calc(int nums[], int a) {
		int count = 0;
		for (int i : nums) {
			if (i > a)
				count++;
		}
		return count;

	}

	public static void printResult(int[] results, int count) {
		System.out.println(Arrays.toString(results));
		System.out.println("Количество замен = " + count);
	}
}

8.
public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 0, 0, 3, 4, 10, -60, -70 };
		int a = calc1(nums);
		int b = calc2(nums);
		int c = calc3(nums);
		printResult(a, b, c);
	}

	public static int calc1(int nums[]) {
		int count1 = 0;
		for (int i : nums) {
			if (i > 0)
				count1++;
		}
		return count1;

	}

	public static int calc2(int nums[]) {
		int count2 = 0;
		for (int i : nums) {
			if (i < 0)
				count2++;
		}
		return count2;

	}

	public static int calc3(int nums[]) {
		int count3 = 0;
		for (int i : nums) {
			if (i == 0)
				count3++;
		}
		return count3;

	}

	public static void printResult(int count1, int count2, int count3) {
		System.out.println("Количество положительных элементов = " + count1);
		System.out.println("Количество отрицательных элементов = " + count2);
		System.out.println("Количество нулевых элементов = " + count3);
	}
}



9.
package sav;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 17, 22, 30, 11, 80 };
		int max = nums[0];
		int min = nums[0];
		max = max(nums, max);
		min(nums, min);
		printMin(min);
		printMax(max);
	}

	public static int max(int[] nums, int max) {
		for (int i = 0; i < nums.length; i++) {
			if (max > nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}

	public static int min(int[] nums, int min) {
		for (int i = 0; i < nums.length; i++) {
			if (min < nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}

	public static void printMin(int min) {
		System.out.println("min = " + min);
	}

	public static void printMax(int max) {
		System.out.println("max = " + max);
	}
}

10.

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 0, 120, 0, 65, 0, 0, 0 };
		int[] results;
		results = metod(nums);
		printResult(results);
	}

	public static int[] metod(int[] nums) {
		int size = calc(nums);
		int index = 0;
		int[] mas = new int[size];
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > i) {
				mas[index] = nums[i];
				index++;
			}
		return mas;
	}

	public static int calc(int nums[]) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > i) {
				count++;
			}
		}
		return count;

	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}

11.
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int k = readKFromConsole("Введите k ");
		int l = readLFromConsole("Введите l ", k);
		int c = metod(k, l);
	}

	public static int readKFromConsole(String message) {
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		k = sc.nextInt();
		return k;
	}

	public static int readLFromConsole(String message, int k) {
		Scanner sc = new Scanner(System.in);
		int l = 0;
		int z;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		z = sc.nextInt();
		if (z > 0 & z < (k - 1))
			l = z;
		else
			System.out.println("Число не подходит");
		return l;
	}

	public static int metod(int k, int l) {
		int[] nums = { 17, 22, 30, 65, 80 };
		int c = 0;
		int d = 0;
		boolean result = true;
		for (int i : nums) {
			c = i / k;
			if (i % k != l) {
				result = false;
				break;
			} else
				System.out.println("d = " + (d = i));
		}
		return d;

	}
}
12.
13.
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int k = readIntFromConsole("Введите k ");
		int l = 1;
		int m = 70;
		int c = metod(k, l, m);
		printResult(c);
	}

	public static int readIntFromConsole(String message) {
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		k = sc.nextInt();
		return k;
	}

	public static int metod(int k, int l, int m) {
		int[] nums = { 16, 20, 30, 65, 80 };
		int d = 0;
		boolean result = true;
		for (int i : nums) {
			if (i % k != 0 && i < l && i > m) {
				result = false;
				break;
			} else
				d = i;
		}
		return d;
	}

	public static int printResult(int d) {
		System.out.println("c = " + d);
		return d;
	}

}

14.
public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 17, 22, 30, 11, 80, 66 };
		int max = nums[1];
		int min = nums[0];
		max = max(nums, max);
		min = min(nums, min);
		printSumma(min, max);
	}

	public static int max(int[] nums, int max) {
		for (int i = 1; i < nums.length; i = i + 2) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}

	public static int min(int[] nums, int min) {
		for (int i = 0; i < nums.length; i = i + 2) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}

	public static void printSumma(int min, int max) {
		System.out.println("Сумма = " + (min + max));
	}

}

15.
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 16, 20, 30, 65, 80 };
		int d = readIntDFromConsole("Введите D ");
		int e = readIntEFromConsole("Введите E ");
		int c = metod(d, e, nums);
		printResult(c);
	}

	public static int readIntDFromConsole(String message) {
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		k = sc.nextInt();
		return k;
	}

	public static int readIntEFromConsole(String message) {
		Scanner sc = new Scanner(System.in);
		int l;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		l = sc.nextInt();
		return l;
	}

	public static int metod(int k, int l, int nums[]) {
		int d = 0;
		for (int i : nums) {
			if (i > k && i < l)
				d = i;
		}
		return d;
	}

	public static void printResult(int d) {
		System.out.println("c = " + d);
	}

}
16.
17.
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 17, 22, 30, 11, 80, 66, 8 };
		int[] results;
		int min = nums[0];
		min = min(nums, min);
		results = metod(nums, min);
		printResult(results);
	}

	public static int min(int[] nums, int min) {
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}

	public static int[] metod(int[] nums, int min) {
		int size = calc(nums, min);
		int index = 0;
		int[] mas = new int[size];
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != min) {
				mas[index] = nums[i];
				index++;
			}
		return mas;
	}

	public static int calc(int nums[], int min) {
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != min) {
				a++;
			}
		}
		return a;

	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}

18.
19.
20.
package sav;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 120, 65, 10, 60, 70, 80, 56, 343, 3423, 454, 4545 };
		int[] results;
		results = metod(nums);
		printResult(results);

	}

	public static int[] metod(int[] nums) {
		for (int i = 1; i < nums.length; i = i + 2) {
			nums[i] = 0;
		}
		return nums;
	}

	public static int calc(int nums[]) {
		int count = 0;
		for (int i : nums) {
			if (i % 2 == 0) {
				count++;
			}
		}
		return count;

	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}
