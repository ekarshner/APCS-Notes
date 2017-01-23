public static void selectionSort(Integer [] data){
    for(int i = 0; i < data.length -1; i++){
	int a = minPos(data, i, data.length);
	int hold = data[a];
	data[a] = data[i];
	data[i] = hold;
    }
}
