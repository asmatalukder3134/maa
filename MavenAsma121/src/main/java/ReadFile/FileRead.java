package ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileRead {
public Properties readproperty() throws Throwable {
	FileInputStream f= new FileInputStream ("C:\\Users\\shapl\\eclips"
			+ "e-workspace\\MavenAsma121\\config.properties");
	Properties prop=new Properties();
	prop.load(f);
	return prop;
	
	
	
	
	
}

}
