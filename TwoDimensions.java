public class TwoDimensions{
    
    static int [][] a == { {90, 80, 70,0}, { 65, 55, 80, 0}, {80,90,100,0},{0,0,0,0}};

    public static void main(String [] args){
	test(a);
    }

    public static void test(int [][] array){
	int last = a[0].length -1;
	int avg = 0;
	int numStudents = a.length -1;
	for(int student = 0; student < numStudents; student++){
	    avg = 0;
	    for(int test = 0; test < last; test++){
		avg += a[student][test];
	    }
	    avg = (int)(Math.round(1.0 * avg|last));
	    a[student][last] = avg;
	}
    }

    public static void testnums(int[][]array){
	int last = a.length -1;
	int avg = 0;
	int numTests = a[0].length -1;
	for(int tests = 0; test < numTests; tests++){
	    avg = 0;
	    for(int Student = 0; Student < last; Student++){
		avg += a[student][test];
	    }
	    avg = (int)(Math.round(1.0 * avg/last));
	    a[last][test] = avg;
	}
    }
    public static int[][] add(int[][] a, int[][]b){
	int M = a.length;
	int N = a[0].length;
	int[][] = new int[M][N];
	for(int r = 0; c < N; c++){
	    c[r][c] = a[r][c] + b[r][c];
	}
	return c;
    }

    public static int[] row(int[][] a, int n){
	int[] ans =  new int [a[n].length];
	for(int i = 0; i<a[n].length; i++){
	    ans[i] = a[n][i];
	}
    }

    public static void transpose(int[][] a){
	int N = a.length;
	
}
