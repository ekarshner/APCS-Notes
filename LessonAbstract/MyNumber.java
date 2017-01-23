public abstract class MyNumber{
    private int _intValue;
    
    public MyNumber(int n){
	_intValue = n;
    }

    public int intValue{
	return _intValue;
    }

    public double doubleValue(){
	return (double)intValue;
    }
    
    public String convert(){
	String ans = "";
	int pos;
	int intVal = _intValue;
	String digits = getDigits();
	if(intVal ==  0)
	    ans = digits.substring(0,1);
	while(intVal/getBase() != 0){
	    int pos = intVal%getBase();
	    ans += digits.substring(pos,pos+1)+ans;
	    intVal /= getBase;
	}
	return ans;
    }
    
    public String toString(){
	return getValue();
    }

    public abstract String getValue();
    public abstract int getBase();
    public abstract String getDigits();
}
