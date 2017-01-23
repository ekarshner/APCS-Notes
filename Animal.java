public abstract class Animal implements Mover{
    protected Ecosysten _eco;
    protected int _pos;
   
    public Animal(Ecosystem eco, int pos){
	_eco = eco;
	_pos = pos;
	eco.getRiver()[pos] = this;
    }
}
