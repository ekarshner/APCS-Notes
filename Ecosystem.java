public class Ecosystem{
    private Animal[] _river;
    private int _populationSize;

    public Ecosystem(int capacity, int numFish, int numBear){
	_populationSize = numFish + numBear;
	_river = new Animal[capacity];
	while(numFish-- > 0){
	    new Fish(this,getRandomPos());
	    _populationSize++;
	}
	while(numBear-- > 0){
	    new Bear(this, getRandomPos());
	    _populationSize++;
	}
    }
    
    public int getRandomPos(){
        if(isFull()) return -1;
	int openPos = _river.length - _populationSize;
	int[] pos = new int[openPos];
	int j = 0;
	for(int i = 0; i < river.length && j < openPos; i++){
	    if(_river[i] == null)
		pos[j++] = _river[i];
	}
	int number = (int)(Math.random() * pos.length);	
	return pos[number];
    }

    public Animal[] getRiver(){
	return _river;
    }

    public void Step(){
	Animal [] animals = new Animal[_populationSize];
	int pos = 0;
	for(int i=0; i<_river.length;i++){
	    if(_river[i] != null)
		animals[pos++] = _river[i];
	}
	for(Animal a : animals){
	    a.move();
	}
    }
}
