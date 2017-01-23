import wheels.users.Frame;
import wheels.users.Ellipse;
import wheels.users.ConversationBubble;
import wheels.users.Line;
import wheels.users.RoundedRectangle;

import java.awt.Color;

public class SunCartoon extends Frame{
    private Ellipse _circle;
    private ConversationBubble _bubble;

    public SunCartoon(){
	super();
	_circle = new Ellipse(Color.orange);
	_circle.setLocation(150,200);
	_circle.setSize(200,200);
	
	_bubble = new ConversationBubble("Here comes the sun!");
	_bubble.setTailDirection(ConversationBubble.TAIL_DIR_LEFT);
	_bubble.setLocation(175,100);
    }

    public static void main(String [] args){
	SunCartoon app = new SunCartoon();
    }}
