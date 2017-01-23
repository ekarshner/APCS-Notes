public static void walkDown(Integer [] data, int a){
    int temp = 0;
    for(i = 0; i < a; i++){ 
	if(data[a] < data[a-1]){
	    temp = data[a-1];
	    data[a-1] = data[a];
	    data[a] = temp;}
	else break;
    }
}
	

public static void insertionSort(Integer [] data, int a){
    for(i = 0; i < data.length; i++){
	
