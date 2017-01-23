public abstract class MyNumber{
    private int _intValue;

    public boolean equals(Object rhs){
	return (this = rhs)||((rhs != null)&&((rhs instanceof MyNumber) && (intValue() == ((MyNumber)rhs).intValue())));
    }
    
    MyNumber n = new Binary(3);
    //n.equals(n) -> true
    //n.equals(null) -> false
    //n.equals("hi")-> false
    //n.equals(new Octal(3))->false
    //n.equals(new Binary(3))->true

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
	
    }
    
    public String toString(){
	return getValue();
    }

    public abstract String getValue();
    public abstract int getBase();
    public abstract String getDigits();
}
