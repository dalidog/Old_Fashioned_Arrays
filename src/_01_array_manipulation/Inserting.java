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
}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		boolean hasInserted = false;
		String[] outputArray = new String[orderedArray.length+1];
		for (int i = 0; i < orderedArray.length; i++) {
			if(string.compareTo(orderedArray[i])<0 && string.compareTo(orderedArray[i+1])>0) {
				outputArray[i] = string;
				hasInserted = true;
			}
			else if(hasInserted == true) {
				outputArray[i] = orderedArray[i-1];
			}
		else {
				outputArray[i] = orderedArray[i];
			}
			
		}
		
				
		
			
		
		return orderedArray;
	}}
