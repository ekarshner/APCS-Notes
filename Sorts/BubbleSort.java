public static boolean sinkMax(Integer [] data, int b){
    boolean ans = true;
    for(int i = 0; i < b; i++){
	if(data[i] > data[i+1]){
	    Integer temp = data[i];
	    data[i] = data[i+1];
	    data[i+1] = temp;
	    ans = false;
	}
    }
    return ans;
}

public static void ModifiedbubbleSort(Integer [] data){
    for(int i = data.length; i > 1; i--){
	if(sinkMax(data, i))
	    break;
    }
}
