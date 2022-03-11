import java.io.*;
import java.util.*;

public class Caesar{

	public static void main(String[] args){
		try {
			if(args.length == 0){
				throw new Exception("No key or file specified.");
			}
			if(args.length != 2 && args.length !=3){
				throw new Exception("No file specified.");
			}
	
			int key = Integer.parseInt(args[0]);
			File inFile = new File(args[1]);
			BufferedReader in = new BufferedReader(new FileReader(inFile));
			StringBuilder uncipheredString = new StringBuilder();
			StringBuilder cipheredString = new StringBuilder();
			String newLine = "";
			String line = System.getProperty("line.separator");	
			
			while((newLine = in.readLine())!= null){
				uncipheredString.append(newLine);
				uncipheredString.append(line);
			}
			
			String fileString = uncipheredString.toString();
			char[] charArray = fileString.toCharArray();
			Caesar convertKey = new Caesar(); 
			
			for(int i=2;i<=charArray.length-1;i++){
				cipheredString.append(convertKey.cipherEncode(key,charArray[i-2]));
			}

			String outputString = cipheredString.toString();
			
			if(args.length==3){
				createFile(args[2],outputString);
			}
			else{
				System.out.println(outputString);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Usage Statement: java Caesar key infile [outfile]");
		}
	}


	public char cipherEncode(int key, char c){
		int charValue = (int) c;
		char outputChar;
		if(charValue < 32 || charValue > 126){
			outputChar = (char)charValue;	
		}
		charValue = charValue + key;
		if(charValue>126){
			charValue = charValue-95;
		}
		if(charValue<32){
			charValue=charValue + 95;
		}
		outputChar = (char)charValue;
		return outputChar;
	}

	public static void createFile(String name, String content){
		try{
			File file = new File(name);
			FileWriter fWriter = new FileWriter(file,true);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write(content);
			bWriter.close();
			fWriter.close();
		}
		catch(IOException e){
			System.out.println("Unable to create new file.");
			e.printStackTrace();
		}
	}
}