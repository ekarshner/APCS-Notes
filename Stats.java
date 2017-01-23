public class Stats{

    private static int findMax(int[] nums){
	int max = 0;
	for(int x :nums)
	    if (x>max) max = x;
	return max;
    }

    public static int[] calculateModes(int[] tally){
	int countModes = 0;
	int max = findMax(tally);
	for(int x :tally){
	    if(x == max)
		countModes++;
	}
	int [] modes = new int[countModes];
	int in = 0;
	for (int i = 0; i < tally.length; i++){
	    if (tally[i] == max){}
	}	
    }

    public static int kthDataValue(int[] tally){
	int output = 0;
	for(int i=0;i < tally.length; i++){
	    k -= tally[i];
	    if(k<=0){
		output = i;
		break;
	    }
	}
	return output;
    }
    
    public static void main(String [] args){
	int [] tally = {0,0,10,5,10,0,7,1,0,6,0,10,3,0,0,1};
	System.out.println("\tvalue\tfrequency");
	for (int i = 0; i<tally.length;i++){
	    System.out.println("/t" + i + "/t" + tally[i]);
	}
    }
