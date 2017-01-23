public class Quad{
    public static void main(String [] args){
	Double a = Double.parseDouble(args[0]);
	Double b = Double.parseDouble(args[1]);
	Double c = Double.parseDouble(args[2]);

	if(a == 0){
	    System.out.println("Not a Quadratic");
	}
	else if((b*b-4*a*c)<0){
	    System.out.println("Imaginary roots");
	}
	else{
	    System.out.println(((b + Math.sqrt(b*b-4*a*c))/(2*a)));
	    System.out.println(((b - Math.sqrt(b*b-4*a*c))/(2*a)));
	}
    }
}
	    

