public class FibonacciWordArgs {
    public static void main(String [] args){
	String s1 = args[0];
	String s2 = args[1];
	String s3 = s2 + s1;
	String s4 = s3 + s2;
	String s5 = s4 + s3;

	System.out.println(s1 + "," +  s2 + "," + s3 + "," + s4 + "," + s5);
    }
}
