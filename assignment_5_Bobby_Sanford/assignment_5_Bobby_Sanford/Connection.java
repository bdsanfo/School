import java.io.*;
import java.net.*;
import java.util.*;

public class Connection implements Runnable{
	private Socket socket;

	public Connection(Socket socket){
		this.socket = socket;
	}

	public void run(){
		int lineNumber = 0;
		String fileName="";
		FileReader file;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line;
			while ((line=in.readLine()) !=null){
				lineNumber++;
				if(lineNumber==1){
					fileName = extractFileName(line);
					if(fileName.equals("")){
						fileName = "index.html";
					}
					System.out.println("Attempting to load "+fileName);
				}
			}
			file = new FileReader("C:\\Programs\\Project5\\Webserver\\"+fileName);
		}catch(FileNotFoundException e){
			System.out.println("Unable to find file named "+fileName+".");
		}catch(IOException e){
			e.printStackTrace();
			
		}
		/*
		try{

			if(true){
				throw new Exception("caught Exception");
			}
		}catch(Exception e){
			System.out.println(e);
		}
		*/
	}

	public String extractFileName(String input){
		int fileNameStartLocation = input.indexOf("/");
		int fileNameEndLocation = input.lastIndexOf(" ",input.length()-1);
		String fileName = input.substring(fileNameStartLocation+1,fileNameEndLocation);
		return fileName;
	}

	
}