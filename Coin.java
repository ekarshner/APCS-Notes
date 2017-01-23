public class Coin{
    private boolean _headsUp;
    private String _head, _tail;
    
    public Coin(){
	super();
	_headsUp = true;
	_head = "H";
	_tail = "T";
    }

    public String flip(){
	if(Math.random() < 0.5)
	    _headsUp = !_headsUp;
	if(_headsUp) return _head;
	return _tail;
	}
    
    public String toString(){
	if(_headsUp) return _head;
	return tail;
    }

}
