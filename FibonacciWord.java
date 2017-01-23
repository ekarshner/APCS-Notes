public class FibonacciWord {
    public static void main(String [] args){
	String s1 = "a";
	String s2 = "b";
	String s3 = s2 + s1;
	String s4 = s3 + s2;
	String s5 = s4 + s3;

	System.out.println(s1 + " " +  s2 + " " + s3 + " " + s4 + " " + s5);
    }
}
