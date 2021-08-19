package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements AutoConstants
{
	public String getData(String key) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(propertyfilePath));
		return p.getProperty(key);
		
	}

}
