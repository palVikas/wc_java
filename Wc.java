import java.io.*;

class Wc{
	private String text;

	public Wc(String init){
		this.text = init;
	}
	
	public int getCountLines(){
		return this.text.split("\r\n").length-1 ;
	}

	public int getCountCherecters(){
    	return this.text.length();
  }

    public int getCountWords(){
    	int wordCount=0;
    	String text = this.text.trim();
    	text = text.replaceAll("\\s+"," ");
    	for(String line : text.split("\r\n")) {
    		for(String space : line.split(" "))
    			wordCount++;
    	}

  		return wordCount;
    }

    

}