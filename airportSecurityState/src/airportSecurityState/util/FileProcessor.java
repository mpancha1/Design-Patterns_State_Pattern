package airportSecurityState.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileProcessor {

	BufferedReader br;
	FileReader in;
	public FileProcessor(String file_name){
	
	MyLogger.writeMessage("Making File Processor", MyLogger.DebugLevel.CONSTRUCTOR);
		try {
			in = new FileReader(file_name);
			br = new BufferedReader(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File not Found!!!");
			e.printStackTrace();
		} 
			
		
	}
	
	public String readLine(){
		String line = null;
		
		try {
			line = br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Exception in reading line from File!!!");
			e.printStackTrace();
		}
		
		
		
		return line;
	}
	
	
	
 
  
}

