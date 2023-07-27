package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utilities {

    public static String getGlobalValue(String key) throws IOException, FileNotFoundException {

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("/Users/shafiqahmedkhan/Downloads/BookingApp/src/test/java/resources/global.properties");
        properties.load(fis);

        return properties.getProperty(key);

    }

}
