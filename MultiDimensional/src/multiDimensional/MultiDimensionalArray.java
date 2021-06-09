package multiDimensional;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a [][] = {{1,3,4},{3,4,5}};
		int b [][] = {{1,3,4},{3,4,5}};
		
        System.out.println("Output :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int penjumlahan = a[i][j] + b[i][j]; 
	            System.out.print( penjumlahan + " ");
	            }
            System.out.println();
		}

	}

}
