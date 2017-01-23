public class MatrixMult{


    public static void print(int [] [] data){
	for (int[] row: data){
	    for (int i: row){
		System.out.print(i + " ");
	    }
	    System.out.println();
	}
    }


    // precondition: a != null, b != null, both a and b are
    //               square matrices.
    public static int[][] mult(int[][] a, int [][] b){
	int[][] c = new int[a.length][a.length];
	for(int row = 0; row < a.length; row++){
	    for(int column = 0; column < a.length; column++){
		for(int p = 0; p < a[i].length; p++){
		    c[row][column] += a[row][p] * b[k][column];
		}
	    }
	}
	return output;
    }
    
    

    public static void main(String [] args){
	int [] [] A  = {{1,2}, {3,4}};
	int [] [] B  = {{0,-1}, {5,2}};
	System.out.println("A: ");
	print(A);
	System.out.println("B: ");
	print(B);
	System.out.println("AA: ");
	print(mult(A,A));
	System.out.println("BB: ");
	print(mult(B,B));
	System.out.println("AB: ");
	print(mult(A,B));
	System.out.println("BA: ");
	print(mult(B,A));

	

    }
    

}
