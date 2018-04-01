
import java.util.*;

/**
 * 
 */
public interface Move {


    /**
     * @param mouseX 
     * @param mouseY 
     * @param dot 
     * @param graph [][] 
     * @return
     */
    public Point doMove(void mouseX, void mouseY, Dot dot, boolean graph [][]);

}