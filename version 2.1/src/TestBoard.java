import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class TestBoard {
	public void teseboard() {
		int[][] arrayint = new[6][3];
		
		arrayint[0][0]=1;
		arrayint[0][0]=1;
		arrayint[0][0]=1;
		arrayint[0][0]=1;
		arrayint[0][0]=1;
		arrayint[0][0]=1;
		arrayint[0][0]=1;
		arrayint[0][0]=1;
		
		Board b=new Board( 6,arrayint);
		
		public void testctreateboard();{
			
		}
		
		public void testprintboard();{
			
		}
		Board z = new Board();
		public void testcount() {
			System.out.println("======TEST TWO EXECUTED=======");
			Assertions.assertEquals(2, b.count(5,6));
		}
		public void testcount() {
			System.out.println("======TEST THREE EXECUTED=======");
			Assertions.assertEquals(2, b.count(3,4));
		}

}
}
