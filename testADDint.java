package dea;
import static org.junit.Assert.*;
import org.junit.Test;

public class testint {

	@Test
	public void test() {
	        sleep obj = new sleep();
	        int ga = 50;
	        int gi = 50;
	        assertEquals(100, obj.add_num(ga,gi));

}
	@Test
	public void test2() {
	        sleep obj = new sleep();
	        int ga = 25;
	        int gi = 25;
	        assertEquals(100, obj.add_num(ga,gi));

}
}
