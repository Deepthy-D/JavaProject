
public class ArrayDiagonalSum {

	 public static void main(String[] args) {
		    int[][] array = {
		      {7, 2, 9, 1},
		      {4, 8, 2, 7},
		      {8, 13, 19, 10},
		      {13, 12, 16, 14}
		    };

		    int primaryDiagonalSum = 0;
		    int secondaryDiagonalSum = 0;

		    for (int i = 0; i < array.length; i++) {
		      primaryDiagonalSum += array[i][i];
		      secondaryDiagonalSum += array[i][array.length - i - 1];
		    }

		    System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);
		    System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
		  }

}
