package dea;
import static org.junit.Assert.*;
import org.junit.Test;

public class str {

	@Test
	public void test() {
			sleep obj = new sleep();
	        String ga = "sachin";
	        String gi = "tendulkar";
	        assertEquals("sachintendulkar",obj.add_str(ga,gi));
	        
	}
	@Test
	public void test1() {
			sleep obj = new sleep();
	        String ga = "ichigo";
	        String gi = "kurasagi";
	       
	        assertEquals("bleach",obj.add_str(ga,gi));
	}

}
