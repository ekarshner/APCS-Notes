public class BiasedCoin extends Coin{
    private double _headBias;

    public BiasedCoin(double headBias){
	super();
	if(headBias < 0 || headBias >= 1)
	    throw new IllegalArgumentException("arg must be between 0 and 1");
	_headBias = headBias;
    }

    public string flip(){
	if(Math.random() > _headBias)
	    _headsUp = false;
	else
	    _headsUp = true;
	if(_headsUp)
	    return _head;
	return _tail;
    }
}
