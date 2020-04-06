package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class TestFirstWin {
	
	DesktopOptions deso=new DesktopOptions();

	
	@Test
	public void TestMWWE() throws MalformedURLException{
		/*deso.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), deso);
		*/
		List al = new ArrayList<String>();
		
		al.add("3");
		al.add("2222222222222222");
		
		System.out.println(al.get(1));
		
		List ll = new LinkedList<String>();
		ll.add("ds");
		ll.add("hi doll");
		ll.add("fds");
		System.out.println(ll.get(1));
			
		
			Set	s =new HashSet<String>();
			s.add("sds");
			s.add("dasd");
			s.add("sdstr");
			s.add("sdtrs");
			System.out.println(s.size());
			
			
		
	}

}
