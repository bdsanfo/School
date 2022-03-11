import java.io.*;
import java.net.*;
import java.lang.*;

public class ReadWebPage extends BrowserPanel{
	public String title;

	public String ReadWebPage(String enteredURL){
		String line;
		String returnString = "";
		boolean body = false;
		StringBuilder bodyBuilder = new StringBuilder();
		enteredURL = enteredURL.toLowerCase();
		if(enteredURL.contains("http")){
			enteredURL = enteredURL;
		}else{
			enteredURL = "http://" + enteredURL;
		}

		try{
			if(enteredURL.contains("https")){
				throw new Exception("Website is encrypted.");
			}
			URL url = new URL(enteredURL);
			String webAddress = url.getAuthority();
			Socket socket = new Socket(webAddress,80);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.print("GET /"+ url.getPath() +" HTTP/1.1\r\n");
			out.print("host: "+ webAddress +"\r\n\r\n");
			out.flush();
			while((line=in.readLine()) != null){
				if(line.contains("<title>")){
					setTitle(line);
				}
				if(line.contains("<body")){
					body = true;
				}
				if (body){
						bodyBuilder.append("\n");
						bodyBuilder.append(line);
				}
				if (line.contains("</body>")){
					body = false;
				}
			}
			returnString = bodyBuilder.toString();
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Unable to connect to the entered address.");
		}
		return returnString;
	}

	public void setTitle(String line){
		int titleStartLocation = line.indexOf(">");
		int titleEndLocation = line.lastIndexOf("<",line.length()-1); 
		title = line.substring(titleStartLocation+1,titleEndLocation);
		System.out.println(title);
	}

	public String getTitle(){
		return title;
	}
}