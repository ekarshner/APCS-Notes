public class test{
    public static void main (String [] args){
	int a[][] = {{1,2,3},{4,5,6}};
	sum(a);
    }

    public static void sum(Object[][] array){
	int ans = 0;
	for(Object x: array){
	    for(Object e : x){
		ans += array[x][e];
	    }
	}
	System.out.println(ans);
    }
}
