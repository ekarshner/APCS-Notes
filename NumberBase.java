public class NumberBase{
    public static void main(String [] args){
	int w = Integer.parseInt(args[0]);
	String s = args[0];
	//System.out.println(randomBinary(w));
	System.out.println(binaryToInt(s));
    }
    public static String randomBinary(int len){
	String randop = "";
	for(int i = 0; i < len; i++){
	    randop += (int)(Math.random() * 2);
	}
	return randop;
    }


    public static int binaryToInt(String binary){
	int fini = 0;
	String tempo = binary;
	for(int i = 0; i < binary.length(); i++){
	    int leng = tempo.length();
	    fini += (Integer.parseInt(tempo.substring(leng - 1)) * (int)(Math.pow(2, i)));
	    tempo = tempo.substring(0,leng - 1);
	    //System.out.println(fini);
	}
	return fini;
    }
	    
	
}
