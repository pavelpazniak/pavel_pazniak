2.
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 200, 7, 8, 16, 9, 1, 6 };
		int[] results;
		results = metod(nums);
		printResult(results);

	}

	public static int[] metod(int[] nums) {
		int[] nums2 = { 20, 23, 45, 35, 28, 24, 30 };
		int[] nums3 = new int[nums.length + nums2.length];
		System.arraycopy(nums, 0, nums3, 0, nums2.length);
		System.arraycopy(nums2, 0, nums3, nums.length, nums2.length);
		for (int i = 1; i < nums3.length; i++)
			for (int j = i; j > 0; j--) {
				if (nums3[j - 1] > nums3[j]) {
					int temp = nums3[j];
					nums3[j] = nums3[j - 1];
					nums3[j - 1] = temp;
				}
			}
		return nums3;
	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}

3.
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 8, 16, 9, 1, 6 };
		int[] results;
		results = metod(nums);
		printResult(results);

	}

	public static int[] metod(int[] nums) {
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

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}
4.
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 8, 16, 9, 1, 6 };
		int[] results;
		results = metod(nums);
		printResult(results);

	}

	public static int[] metod(int[] nums) {
		for (int i = 1; i < nums.length; i++)
			for (int j = i; j > 0; j--) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}

		return nums;
	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}
5.
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 8, 16, 9, 1, 6 };
		int[] results;
		results = metod(nums);
		printResult(results);

	}

	public static int[] metod(int[] nums) {
		int temp, j;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				temp = nums[i + 1];
				nums[i + 1] = nums[i];
				j = i;
				while (j > 0 && temp < nums[j - 1]) {
					nums[j] = nums[j - 1];
					j--;
				}
				nums[j] = temp;
			}
		}
		return nums;
	}

	public static void printResult(int[] results) {
		System.out.println(Arrays.toString(results));
	}
}
