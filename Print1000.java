public class Print1000{
    public static void main(String [] args){
	for(int n = 1000; n < 2000; n++){
	    if((n+1)%5 == 0)
		System.out.println(n);
	    else
		System.out.print(n + " ");
	}}}
