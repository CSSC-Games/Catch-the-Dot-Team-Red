
import java.util.*;

/**
 * 
 */
public class Game implements Serializable, GameObject {

    /**
     * Default constructor
     */
    public Game() {
    }

    /**
     * 
     */
    protected Menu menu;

    /**
     * 
     */
    protected GameMap map;

    /**
     * 
     */
    protected Dot dot;

    /**
     * 
     */
    protected FrameRate frameRate;

    /**
     * 
     */
    protected List<String> soundsPath;

    /**
     * 
     */
    protected Player players[1..2];

    /**
     * 
     */
    public Mode mode;








    /**
     * @param mode
     */
    public void Game(Mode mode) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void onInit() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int onMenu() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public void onClear() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Point onThink() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void onRender() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void onPause() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void onResum() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void onWin() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void onlose() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void saveGame() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean loadGame() {
        // TODO implement here
        return false;
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