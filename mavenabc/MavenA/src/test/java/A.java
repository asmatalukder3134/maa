import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public void getelement(ChromeDriver dr) {
	List<WebElement>elements=	dr.findElements(By.xpath(""));
	int size=elements.size();
	String []x=new String[size];
	Integer[]k=new Integer[size];
		for(int i=0;i<=size;i++) {
			if(elements.get(i).getText().contains("s"));
			System.out.println(elements.get(i).getText());
			
		}
	}

}
