package urlTestService1;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestServiceURL {
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
				}

			} catch (Exception e) {

				continue;
			}
			if (test = true) {
				temp.add(string);
			}

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

			} catch (Exception e) {
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
