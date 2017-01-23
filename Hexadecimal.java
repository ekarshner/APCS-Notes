public class Hexadecimal extends MyNumber{

    private String _hexadecimal;

    public Hexadecimal (int n){
	super(n);
	_hexadecimal = convert();
    }
    
    public int getBase(){
	return 16;
    }

    public String getDigits(){
	return "0123456789ABCDEF";
    }

    public String getValue(){
	return _hexadecimal;
    }
}
