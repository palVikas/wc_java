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
	public void getCountLines_gives_3_when_we_give_the_string_that_contains_new_three_lines() {
		Wc wc = new Wc("Hello \r\n How are You ?\r\n Tell\r\n");
		assertEquals(2,wc.getCountLines());
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
		String text = "       hii    nahi";
		Wc wc = new Wc(text);
		assertEquals(2,wc.getCountWords());
  	}

  	@Test
  	public void getCountWords_gives_2_for_hii_string () {
	    String text = "hii how are you";
	    Wc wc = new Wc(text);
	    assertEquals(4,wc.getCountWords());
	}

	
	@Test
  	public void getCountWords_gives_0_for_non_empty_string (){
    	String text = "  helooo      ba        gf      nahi       gdf \r\n   b";
    	Wc wc = new Wc(text);
    	assertEquals(6,wc.getCountWords());
	}

	@Test
  	public void readFile_gives_the_content_of_the_file_(){
  		String expected = "hello, this is a good day.\r\nWhat do you think?";
    	ReadFile rf = new ReadFile();
    	String text = rf.readFile();
    	assertEquals(expected,text);

	}

	@Test
  	public void getCountLines_geves_the_numberof_lines_in_given_file(){
    	ReadFile rf = new ReadFile();
    	String text = rf.readFile();
    	Wc wc = new Wc(text);
    	assertEquals(1,wc.getCountLines());

	}
	@Test
  	public void getCountwords_geves_the_numberof_lines_in_given_file(){
    	ReadFile rf = new ReadFile();
    	String text = rf.readFile();
    	Wc wc = new Wc(text);
    	assertEquals(10,wc.getCountWords());

	}
	@Test
  	public void getCountCherecters_geves_the_numberof_lines_in_given_file(){
    	ReadFile rf = new ReadFile();
    	String text = rf.readFile();
    	Wc wc = new Wc(text);
    	assertEquals(46,wc.getCountCherecters());

	}

	@Test
  	public void getCountWithOption_gives_the_number_of_lines_for_l_option(){
    	ReadFile rf = new ReadFile();
    	String text = rf.readFile();
    	Wc wc = new Wc(text);
    	assertEquals(1,wc.getCountWithOption("-l"));
	}

	@Test
  	public void getCountWithOption_gives_the_number_of_charecters_for_c_option(){
    	ReadFile rf = new ReadFile();
    	String text = rf.readFile();
    	Wc wc = new Wc(text);
    	assertEquals(46,wc.getCountWithOption("-c"));
	}
	@Test
  	public void getCountWithOption_gives_the_number_of_words_for_w_option(){
    	ReadFile rf = new ReadFile();
    	String text = rf.readFile();
    	Wc wc = new Wc(text);
    	assertEquals(10,wc.getCountWithOption("-w"));
	}
}