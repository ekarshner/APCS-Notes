import java.util.Scanner;


public class ModDemo {
    public static void main(String [] args){
	Scanner s = new Scanner(System.in);

	System.out.print("Please enter dividend: ");
	int dividend = Integer.parseInt(s.next());
	System.out.print("Please enter divisor: ");
	int divisor = Integer.parseInt(s.next());

	int r = dividend % divisor;
	int floor_mod = Math.floorMod(dividend, divisor);

	

	System.out.println(dividend + " % " + divisor + " = " + r);
	System.out.println("Math.floorMod(" + dividend + " , " + divisor + ") = " + floor_mod);
    }
}
