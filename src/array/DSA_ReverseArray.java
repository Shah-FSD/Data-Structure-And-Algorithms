package array;

public class DSA_ReverseArray {

	public static void main(String[] args) {
		int[] array = {1};
		
		//time complexity O(n/2) 
		int startIndex = 0;
		int lastIndex = array.length-1;
		int temp;
		while(startIndex<lastIndex) {
			temp=array[startIndex];
			array[startIndex] = array[lastIndex];
			array[lastIndex] = temp;
			startIndex++;
			lastIndex--;
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		 }
		}
	}

