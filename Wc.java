class Wc{
	String text;

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
    	return this.text.trim().split(" ").length;
    }

}