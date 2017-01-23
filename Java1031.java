public class Java1031{
    public static void main(String [] args){
	int w = args[0];
	//System.out.println(isSorted(w));
	System.out.println(randomBinary(w));
	
   }
    /*
    public static boolean isSorted(String s){
	for(int i = 0; i < s.length() - 1; i++){
		if(s.substring(i,i+1).compareTo(s.substring(i+1,i+2)) > 0)
		    return false;
	}
	return true;
	} */
    /* public static String sample(String w, int size){
	String s = "";
	for(int i = 0; i < size; i++){
	    int val = (int)(Math.random()* w.length());
	    s += w.substring(val, val + 1);
	    w = w.substring(0,val) + w.substring(val + 1);
	}
	return s;
	} */
    /*public static String shuffle(String w){
	return sample(w, w.Length());
	}*/

	    

}
