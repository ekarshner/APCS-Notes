public class Bear extends Animal{
    
    public Bear(Ecosystem eco, int pos){
	super(eco, pos);
    }
    
    public String toString(){
	return "B";
    }

    public void move() {
	int movement = (int)(Math.random() * 3) - 1;
	int newPosition = _pos + movement;
	if((newPosition >= 0 && newPosition < eco.getRiver().length) && _eco.getRiver()[newPosition] == null){
	    _eco.getRiver()[newPosition] = this;
	    _eco.getRiver()[_pos] = null;
	}
    }
}
