public class CoinStats{
    public static void main(String [] args){
    }

    public static String flipNTimes(Coin c, int n){
	String outcome = "";
	for(int i=0; i < n; i++){
	    outcome += c.flip();
	}
	return outcome
    }
    
    public static int countHeads(String trial){
	int counter = 0;
	for(int i=0; i<trial.length();i++){
	    if(trial.substring(i,i+1).equals("H"))
		counter += 1;
	}
	return counter;
    }
    
    public static int maxRun(String trial, String event){
	int ans = 0, temp = 0;
	for(int i = 0; i<trial.length()-1; i++){
	    if(trial.substring(i,i+1).equals(event)){
		temp++;
	    }
	    else{
		if(temp > ans)
		    ans = temp;
		temp = 0;
	    }
	}
    }

}
