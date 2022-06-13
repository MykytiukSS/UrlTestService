package urlTestService1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


		public static void main(String[] args) throws IOException {
			

			TestServiceURL list = new TestServiceURL();
			File file = new File("C:\\Users\\new\\eclipse-workspace\\UrlTestService\\src\\URL.txt.txt");
			List<String>listUrl = list.listUrl(file);
			
			//for getting list of correct URLs remove comment below
			
			
//	     for (String string : list.testedURL(listUrl)) {
//	    	 System.out.println(string);
//		}
//			
			
			list.showCorrectUrl(listUrl);

	}

}


