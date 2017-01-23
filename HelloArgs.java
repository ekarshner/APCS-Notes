// This program reads arguments from the command line
//java HelloArgs Bill Mary
//output: Hellobill
//HelloMary

public class HelloArgs {
    
    public static void main(String [] args){
	System.out.println("Hello" + args[0]);
	System.out.println("Hello" + args[1]);
    }
}
