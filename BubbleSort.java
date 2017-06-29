
public class BubbleSort {
	public static void main(String args[])
	{
		int[] array1 = {20, 10, 3, 23, 7};
		bubbleSort1(array1);
		for(int i = 0; i < array1.length; i++)
		{
			System.out.print(array1[i] + ", ");
		}
	}
	
	public static void bubbleSort1(int[] numArray) { //sourceed from Stack Overflow

	    int n = numArray.length;
	    int temp = 0;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (numArray[j - 1] > numArray[j]) {
	                temp = numArray[j - 1];
	                numArray[j - 1] = numArray[j];
	                numArray[j] = temp;
	            }

	        }
	    }
	}
}
