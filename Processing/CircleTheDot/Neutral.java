
import java.util.*;

/**
 * 
 */
public class Neutral extends BubbleObject {

    /**
     * 
     */
    protected int id;

    /**
     * 
     */
    protected ButtonState state;

    /**
     * @param x; int 
     * @param y 
     * @param radius
     */
    Neutral(int x, int y, int radius) {
       super(x,y, radius);  
       state  = ButtonState.Released; 
    }

    /**
     * @param center 
     * @param radius
     */
    Neutral(Point center, int radius) {
       super(center.getX(),center.getY(), radius);  
       state  = ButtonState.Released; 
    }
    
    public void draw()
    {
      pushStyle(); 
        fill(config.NeutralFillColor); 
        stroke(config.NeutralStrokeColor); 
        ellipse(center.getX(), center.getY(), this.radius * 2 , this.radius * 2); 
      popStyle();  
    }
    
    public void setId(int id) 
    {
      this.id = id; 
    }
    
    public int getId()
    {
      return this.id;
    }
}
