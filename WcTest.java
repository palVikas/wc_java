import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void getCountLines_gives_0_for_empty_string (){
		String text = "";
		Wc wc = new Wc();
		assertEquals(0,wc.getCountLines(text));
	}

	@Test
	public void getCountLines_gives_1_for_non_empty_string (){
		String text = "hiiii \n\r nahi";
		Wc wc = new Wc();
		assertEquals(1,wc.getCountLines(text));
	}

	@Test
  	public void getCountCherecters_gives_0_for_empty_string (){
    	String text = "";
    	Wc wc = new Wc();
    	assertEquals(0,wc.getCountCherecters(text));
	}

  	@Test
  	public void getCountCherecters_gives_3_for__ram(){
    	String text = "ram";
    	Wc wc = new Wc();
    	assertEquals(3,wc.getCountCherecters(text));
  	}

  	@Test
  	public void getCountCherecters_gives_cherecter_for_given_string(){
    	String text = "ram ji london wale";
    	Wc wc = new Wc();
    	assertEquals(18,wc.getCountCherecters(text));
  	}

}