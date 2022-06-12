package urlTestService1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class TestServiceURL {
     
     
     
     public List<String>tested(ArrayList<String>list)throws IOException{
    	List<String>temp=new ArrayList<>();
    	for (String string : list) {
    		boolean test=false;
    		try {
				URL url = new URL(string);
				HttpURLConnection connection = (HttpURLConnection)url.openConnection();
				int x =connection.getResponseCode();
				if(x==200) {
					test=true;
				}
				
			} catch (MalformedURLException e) {
				
				continue;
			}
    		if(test=true) {
    			temp.add(string);
    		}
				
			
			
		}
    	 
    	 
    	 return temp; 
     }
}
