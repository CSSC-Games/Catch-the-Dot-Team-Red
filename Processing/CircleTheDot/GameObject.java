
import java.util.*;

/**
 * 
 */
public interface GameObject {

    /**
     * @param int 
     * @param int 
     * @return
     */
    public boolean collision(void int, void int);

    /**
     * @param GmaObject 
     * @return
     */
    public boolean collision(void GmaObject);

    /**
     * @param color 
     * @param color 
     * @return
     */
    public void draw(void color, void color);

    /**
     * @param index  
     * @return
     */
    public void playSoundEffect(int index );

    /**
     * @return
     */
    public void stopSoundEffect();

    /**
     * @param int 
     * @return
     */
    public void setVolume(void int);

}