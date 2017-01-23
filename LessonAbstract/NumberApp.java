public class NumberApp{
    public static void main(String [] args){
	MyNumber [] nums = new MyNumber[N];
	int N = Integer.parseInt(args[0]);
	for(int i = 0; i<N; i++){
	    nums[i]=new Binary(i);
	}
	for(MyNumber n : nums)
	    System.out.println(n);
    }
}
