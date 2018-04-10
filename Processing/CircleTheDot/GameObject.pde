
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
    public boolean collision(int mouseX, int mouseY);

    /**
     * @param GmaObject 
     * @return
     */
    public boolean collision(GameObject other);

    /**
     * @param color 
     * @param color 
     * @return
     */
    public void draw(color fillColor, color strockColor);
    
    /**
     * @param index  
     * @return
     */
    public void playSoundEffect(int index);

    /**
     * @return
     */
    public void stopSoundEffect();

    /**
     * @param int 
     * @return
     */
    public void setVolume(int volume);

}
