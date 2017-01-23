public class A extends Object{
    private String _s;

    //constructor
    public A(){
	super();
	_s = "DEFAULT";
    }

    //overwrite the toString() method inherited from the Object class
    public String toString(){
	String ans = super.toString();
	ans += "_s : " + _s;
	return ans;
    }
}
