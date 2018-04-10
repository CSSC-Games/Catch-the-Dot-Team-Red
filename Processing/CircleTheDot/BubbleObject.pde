  
import java.util.*;

/**
 * 
 */
public class BubbleObject implements GameObject {

    /**
     * 
     */
    protected Point center;

    /**
     * 
     */
    protected void radius; int;

    /**
     * @param x 
     * @param y 
     * @param radius
     */
    public void BubbleObject(int x, int y, int radius) {
          this.center = new Point(x,y); 
          this.radius = radius; 
    }

    /**
     * @param center 
     * @param radius
     */
    public void BubbleObject(Point center, int radius) {
          this.center = center;  
          this.radius = radius; 
    }

    /**
     * @param int 
     * @param int 
     * @return
     */
    public boolean collision(void int, void int) {
        // TODO implement here
        return false;
    }

    /**
     * @param GmaObject 
     * @return
     */
    public boolean collision(void GmaObject) {
        // TODO implement here
        return false;
    }

    /**
     * @param color 
     * @param color 
     * @return
     */
     stroke
    public void draw(color strokeColor, color fillColor) {
      pushStyle(); 
        fill(fillColor); 
        stroke(strokeColor); 
        ellipse(center.getX(), center.getY(), this.radius * 2 , this.radius * 2); 
      popStyle(); 
    }

    /**
     * @param index  
     * @return
     */
    public void playSoundEffect(int index ) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void stopSoundEffect() {
        // TODO implement here
        return null;
    }

    /**
     * @param int 
     * @return
     */
    public void setVolume(void int) {
        // TODO implement here
        return null;
    }
}
