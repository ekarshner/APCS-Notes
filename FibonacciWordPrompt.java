import java.util.Scanner;

public class FibonacciWordPrompt {
    public static void main(String [] args){
	Scanner s = new Scanner(System.in);

	System.out.print("Enter 1st term: ");
	String str1 = s.next();

	System.out.print("Enter 2nd term: ");
	String str2 = s.next();

	String s3 = str2 + str1;
	String s4 = s3 + str2;
	String s5 = s4 + s3;

	System.out.println(str1 + "," +  str2 + "," + s3 + "," + s4 + "," + s5);
    }
}
