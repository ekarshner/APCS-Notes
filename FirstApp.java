import wheels.users.Frame;
import wheels.users.Ellipse;
import wheels.users.ConversationBubble;
import wheels.users.Line;
import wheels.users.RoundedRectangle;


import java.awt.Color;

public class FirstApp extends Frame{

    private Ellipse _circle;
    private Line _line;
    private ConversationBubble _bubble;
    private RoundedRectangle _roundRect;
    
    
    // constructor
    public FirstApp(){
	super();
	_circle = new Ellipse(Color.green);
	_circle.setLocation(0,0);
	_circle.setSize(100,100);

	_line = new Line(200,200, 100 ,100);
	_line.setThickness(20);
	_line.setColor(Color.yellow);

	_bubble = new ConversationBubble("Hi there.");
	_bubble.setTailDirection(ConversationBubble.TAIL_DIR_LEFT);
	_bubble.setLocation(50,300);

	_roundRect = new RoundedRectangle(200, 50);
	_roundRect.setFrameColor(Color.blue);
	_roundRect.setFrameThickness(20);
    }


    
    public static void main(String [] args){
	FirstApp app = new FirstApp();

    }

}
