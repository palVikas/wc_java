import java.io.*;

class ReadFile{
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