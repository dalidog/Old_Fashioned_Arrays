package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] testArray) {
		// TODO Auto-generated method stub
		for (int j = 0; j < testArray.length - 1; j++) {
			for (int i = 0; i < testArray.length - 1; i++) {
				if (testArray[i].compareTo(testArray[i + 1]) > 0) {
					String temp = testArray[i];
					testArray[i] = testArray[i + 1];
					testArray[i + 1] = temp;

				} else {

				}

			}
		}
	}

}
