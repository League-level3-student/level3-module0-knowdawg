package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	
	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		double sum = averageIntArray(num);
		
		System.out.println(sum);
		
	}
	
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		
		int current = 0;
		
		for (int i = 0; i < values.length; i++) {
			current = Math.addExact(current, values[i]);
		}

		return current;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		
		double current = 0;
		
			for (int i = 0; i < values.length; i++) {
				current = Math.addExact((int) current, values[i]);
			}
			current = current / values.length;
		
		return current;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
	
		return false;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		
		return 0;
	}
}
