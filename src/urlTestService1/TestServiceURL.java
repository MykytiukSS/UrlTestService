package urlTestService1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestServiceURL {
	
	public List<String>listUrl(File file) throws IOException{
		List<String>list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			for(;;) {
				String string =reader.readLine();
				if (string ==null) {
					break;
				}else {
					list.add(string);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	}
	
	
	
//   This method returns list of correct URLs, ignoring incorrect URLs
	public List<String> testedURL(List<String> listUrl) throws IOException {
		List<String> temp = new ArrayList<>();
		for (String string : listUrl) {
			boolean test = false;
			try {
				URL url = new URL(string);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				int x = connection.getResponseCode();
				if (x == 200) {
					test = true;
					temp.add(string);
				}

			} catch (IOException e) {

				continue;
			}
//			if (test = true) {
//				temp.add(string);
//			}

		}

		return temp;
	}
	//This method only shows lists  of correct and incorrect URLs
	public void showCorrectUrl(List<String> listUrl) {
		List<String> tempCorrect = new ArrayList<>();
		List<String> tempIncorrect = new ArrayList<>();
		
		for (String string : listUrl) {
			boolean test = false;
			try {
				URL url = new URL(string);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				int x = connection.getResponseCode();
				if (x == 200) {
					test = true;
				}

			} catch (IOException e) {
                 tempIncorrect.add(string);
                 continue;
				
			}
			if (test = true) {
				tempCorrect.add(string);
			}

		}
		System.out.println("These URLs are correct:");
		for(String string : tempCorrect) {
	    	 System.out.println(string);
		}
		System.out.println();
		System.out.println("These URLs are incorrect:");
		for(String string : tempIncorrect) {
	    	 System.out.println(string);
		}
		
	}
}
