import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void getCountLines_gives_0_for_empty_string (){
		String text = "";
		Wc wc = new Wc(text);
		assertEquals(0,wc.getCountLines());
	}

	@Test
	public void getCountLines_gives_1_for_non_empty_string (){
		String text = "hiiii \r\n nahi";
		Wc wc = new Wc(text);
		assertEquals(1,wc.getCountLines());
	}

	@Test
	public void getCountLines_gives_2_for_given_string (){
		String text = "helooo    hiiii     \r\n     do you know           me  \r\n    wah!!";
		Wc wc = new Wc(text);
		assertEquals(2,wc.getCountLines());
	}

	@Test
  	public void getCountCherecters_gives_0_for_empty_string (){
    	String text = "";
    	Wc wc = new Wc(text);
    	assertEquals(0,wc.getCountCherecters());
	}

  	@Test
  	public void getCountCherecters_gives_3_for__ram(){
    	String text = "ram";
    	Wc wc = new Wc(text);
    	assertEquals(3,wc.getCountCherecters());
  	}

  	@Test
  	public void getCountCherecters_gives_cherecter_for_given_string(){
    	String text = "ram ji london wale";
    	Wc wc = new Wc(text);
    	assertEquals(18,wc.getCountCherecters());
  	}

  	@Test
  	public void getCountWords_gives_1_for_hii_string (){
		String text = "       hii";
		Wc wc = new Wc(text);
		assertEquals(1,wc.getCountWords());
  	}

 //  	@Test
 //  	public void getCountWords_gives_2_for_hii_string (){
	//     String text = "hii how are you";
	//     Wc wc = new Wc(text);
	//     assertEquals(4,wc.getCountWords());
	// }
	

}