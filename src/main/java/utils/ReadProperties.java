package utils;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    public static Properties readPropertiesFile(String filename) throws IOException {
        Properties prop = null;
        try (InputStream input = new FileInputStream("src/main/resources/" + filename + ".properties")) {
            prop = new Properties();

            // load a properties file
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}