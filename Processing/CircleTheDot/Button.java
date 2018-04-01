
import java.util.*;

/**
 * 
 */
public class Button implements GameObject {

    /**
     * Default constructor
     */
    public Button() {
    }

    /**
     * 
     */
    protected Point position;

    /**
     * 
     */
    protected int w;

    /**
     * 
     */
    protected int h;

    /**
     * 
     */
    public String text;

    /**
     * 
     */
    public List<String> iconesPath;

    /**
     * 
     */
    public List<String> soundPaths;

    /**
     * 
     */
    private ButtonState state;






    /**
     * @param position 
     * @param w 
     * @param h 
     * @param iconePath
     */
    public void Button(Point position, int w, int h, String iconePath) {
        // TODO implement here
    }

    /**
     * @param position ; Point 
     * @param w 
     * @param h 
     * @param message
     */
    public void Button(void position ; Point, int w, int h, String message) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ButtonState getState() {
        // TODO implement here
        return null;
    }

    /**
     * @param iconePath
     */
    public void setIcon(String iconePath) {
        // TODO implement here
    }

    /**
     * @param text
     */
    public void setText(String text) {
        // TODO implement here
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
    public void draw(void color, void color) {
        // TODO implement here
        return null;
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