package DataProvider;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigFileUtils {

	private static final String CONFIG_FILE_PATH = "config.properties";

    public static String getProperty(String key) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(CONFIG_FILE_PATH)) {
            properties.load(input);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void setProperty(String key, String value) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(CONFIG_FILE_PATH)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStream output = new FileOutputStream(CONFIG_FILE_PATH)) {
            properties.setProperty(key, value);
            properties.store(output, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
