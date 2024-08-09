package ProprtieFileReading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class TryToRead {

	public static void main(String[] args) throws IOException {
		//Reading the file location
FileInputStream file1=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
//creating the properties object
Properties pro=new Properties();
//loading file with help of propertie file obj
pro.load(file1);
//Reading data from propertie file(if you name key name like email=basava@gmail.com
String email = pro.getProperty("email");
System.out.println(email);//basava@gmail.com
//to getall keys name ---> approch 1
Set<Object> keys = pro.keySet();
System.out.println(keys);
//to getall keys name ---> approch 2
Set<String> keys2 = pro.stringPropertyNames();
System.out.println(keys2);
//Reading the values
Collection<Object> values = pro.values();
System.out.println(values);
	}

}
