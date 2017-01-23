public class CheckerBoard {
    public static void main(String [] args){
	int numbe = Integer.parseInt(args[0]);
	for(int row = 0; row<numbe; row++){
	    for(int column = numbe; column > 0; column--){
		if((row % 2) == 0)
		    if((column%2)==0)
			System.out.print("B");
		    else
			System.out.print("W");
		else
		    if((column%2)==0)
			System.out.print("W");
		    else
			System.out.print("B");
	    }
	    System.out.println("");
	    }}}
