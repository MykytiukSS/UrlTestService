package urlTestService1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


		public static void main(String[] args) throws IOException {
			List<String>listUrl = new ArrayList(Arrays.asList("https://pureinfotech.com/credential-manager-windows-10","https://q.prog.kiev.ua/login","https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/","https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%B7%D0%B5%D1%82%D0%BA%D0%B0","https://danilovs.eu/","https://www.msn.com/en-xl/europe/top-stories/chemical-plant-hit-in-non-stop-ukraine-fighting/ar-AAYmxiw?ocid=msedgntp&cvid=ac527b2953ce43218fea86e2a714c706","https://www.google.co.uk/","https://www.googleeeeee.co.uk/","https://torgzona.net.ua/","https://torgggzonnna.net.ua/"
	));
			TestServiceURL list = new TestServiceURL();
			//for getting list of correct URLs remove comment below
			
			
//	     for (String string : list.testedURL(listUrl)) {
//	    	 System.out.println(string);
//		}
//			
			
			list.showCorrectUrl(listUrl);

	}

}


