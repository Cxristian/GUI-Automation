package Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReaderFileProperties {

    public Properties loadFile(String fileName) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream(fileName);
            prop.load(input);
        } catch (
                IOException io) {
            io.printStackTrace();
        }
        return prop;
    }

    public static ReaderFileProperties getInstance() {
        return new ReaderFileProperties();
    }
}
