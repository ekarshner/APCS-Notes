public class _Strng{
    public static void main(String [] args){
	string w = args[0];
	lastChar(w);
	firstChar(w);
    }
    
    public static void lastChar(string w){
	String r = w.substring(0,1);
	System.out.println(r);
    }
    
    public static void firstChar(string w){
	int position = w.length();
	String r = w.substring(position - 1);
	System.out.println(r);
    }
    
    public static int occurs(String w, String key){
	int total = 0;
	int index = w.indexOf(key);
	while (index != -1){
	    total++;
	    w = w.substring(index + 1);
	    index = w.indexOf(key);
	}
	return total;
    }
    
}
