//prompts the user from input

//java.util is a package, Scanner is the object

import java.util.Scanner;


public class HelloPrompt{
   
    public static void main(String [] args){
	Scanner s = new Scanner(System.in);

	System.out.print("enter a name: ");
	String name1 = s.next();

	System.out.println("Hello " + name1);
       
	System.out.println("enter another name: ");
	String name2 = s.next();
	System.out.println("Hello " + name2);

    }
}
