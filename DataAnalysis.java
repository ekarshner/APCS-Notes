public class DataAnalysis{
    public static boolean isMode(int[] data, int k){
	return((data[k] > data[k-1]) && (data[k] > data[k+1]));
    }

    public static int modeIndex(int [] data){
	for(int k = 0; k < data.length; k++){
	    if((data[k] > data[k-1]) && (data[k] > data[k+1])) return k;
	}
    }

    public static void printHistogram(int [] data, int longestBar, String barChar){
	System.out.println("Index k     data[k] Length of bar Output of call");
	for(int k = 0; k < data.length; k++){
	    System.out.println(k + "          " + data[k] + "             " + barLength + "          " + bar);
