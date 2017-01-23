public class RandomSum{
    public static void main(String [] args){
	int n = args[0];
	int summ = 0;
	for(int n = n; n > 0;n--){
	    double rando = Math.random();
	    summ += rando;
	}
	System.out.println(summ/n);
    }}
