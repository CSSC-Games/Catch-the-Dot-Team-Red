
import java.util.*;

/**
 * 
 */
public class Obstacle extends Neutral {

    /**
     * Default constructor
     */
    public Obstacle() {
    }

    /**
     * @param x 
     * @param y 
     * @param radus
     */
    public void Obstacle(int x, int y, int radius) {
      super(x, y, radius); 
      this.state  = ButtonState.Pressed;  
    }

   /**
     * @param position 
     * @param radius
     */
    public void Obstacle(Point position, int radius) {
      super(position.getX(), position.getY(), radius); 
      this.state  = ButtonState.Pressed; 
    }


    public void draw()
    {
      pushStyle(); 
        fill(config.ObstacleFillColor); 
        stroke(config.ObstacleStrokeColor); 
        ellipse(center.getX(), center.getY(), this.radius * 2 , this.radius * 2); 
      popStyle();  
    }

}
