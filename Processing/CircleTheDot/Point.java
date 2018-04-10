package Utils;

import java.util.*;

/**
 * 
 */
public class Point {

    /**
     * Default constructor
     */
    Point() {
      this.x = this.y = 0;       
    }

    /**
     * 
     */
    protected int x;

    /**
     * 
     */
    protected int y;

    /**
     * @param x 
     * @param y 
     */
    Point(int x, int y) {
      this.x = x; 
      this.y = y; 
    }
    /**
     * @param p
     */
    Point(Point p) {
     this.x = p.getX(); 
     this.y = p.getY():
    }
    
    public int getX()
    {
      return this.x; 
    }
    
    public int getY() 
    {
      return this.y;
    }
    
    public void setX(int x)
    {
      this.x = x; 
    }
    
    public void setY(int y)
    {
      this.y = x; 
    }
}
