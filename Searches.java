public class Searches{
    
    public static int linearSearch(String [] data, String key){
	for(int i = 0; i < data.length; i++){
	    if(data[i].equals(key))
		return i;
	}
	return -1;
    }

    public static int binarySearch(String [] data, String key){
	for(int i = 0; i < data.length; i++){
	    i = (data.length / 2);
	    if(data[i] = key) return i;
	    if(data[i] > key) i--;
	    if(data[i] < key) i++;
	}
	return -1;
    }
}
