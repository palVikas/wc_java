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

    public String readFile() {
		String text = null;
		File file = new File("D:/wc_java/one.txt"); 
		try {
			FileReader reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			text = new String(chars);
			reader.close();
		} catch (IOException e) {
			System.out.println("Something went wrong.......");
		}

  	 return text;
	}

}