public class BinarySearch{
    public static int binarySearch(Comparable [] array, Comparable key){
	int ans = -1;
	int lowerBound = 0;
	int upperBound = array.length;
	int middle, comp;
	while(lowerBound < upperBound){
	    middle = lowerBound + (upperBound - lowerBound) / 2;
	    comp = key.compareTo(array[middle]);
	    if(comp == 0){
		ans = middle;
		break;
	    }
	    else if (comp > 0) lowerBound = middle + 1;
	    else upperBound = middle;
	}
	return ans;
    }
    
    public static int log2(int n){
	int divide = 0;
	while(n/2 != 0){
	    n /=2;
	    divide++;
	}
	return divide;
    }
}
