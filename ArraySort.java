
public class ArraySort {

	public static void main(String[] args) {
		  
		        ArraySort sorting = new ArraySort();
			    int[] array = {8, 3, 9, 8, 7};
			    System.out.println("Original array:");
			    printArray(array);
			    sorting.sort(array, true); 
			    System.out.println("Sorted array in ascending order:");
			    printArray(array);
			    sorting.sort(array, false); 
			    System.out.println("Sorted array in descending order:");
			    printArray(array);
			  }

			  public void sort(int[] array, boolean ascending) {
			    if (ascending) {
			      // Sort in ascending order
			      for (int i = 0; i < array.length - 1; i++) {
			        for (int j = i + 1; j < array.length; j++) {
			          if (array[i] > array[j]) {
			            // Swap elements
			            int temp = array[i];
			            array[i] = array[j];
			            array[j] = temp;
			          }
			        }
			      }
			    } else {
			      // Sort in descending order
			      for (int i = 0; i < array.length - 1; i++) {
			        for (int j = i + 1; j < array.length; j++) {
			          if (array[i] < array[j]) {
			            // Swap elements
			            int temp = array[i];
			            array[i] = array[j];
			            array[j] = temp;
			          }
			        }
			      }
			    }
			  }

			  public static void printArray(int[] array) {
			    for (int i = 0; i < array.length; i++) {
			      System.out.print(array[i] + " ");
			    }
			    System.out.println();
			  
	}

}
