import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Admin
 *
 */
class TestGame {
	public void liveCellIsAlive() throws Exception {
        assertTrue(LiveCell.INSTANCE.isAlive());
	}
