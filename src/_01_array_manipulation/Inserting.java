package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		// TODO Auto-generated method stub
		int[] testArray2 = new int[testArray.length+1];
		for (int k = 0; k < testArray2.length; k++) {
			if(k == i) {
				testArray2[k] = j;

			}
			else if(k>i) {
				testArray2[k] = testArray[k-1];
			}
			else {
			testArray2[k] = testArray[k];
		}
			
	}
		return testArray2;
}}
