package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesUtility {
    private Properties properties;

    public PropertiesUtility (String text) {
        LoadFile(text);
    }

    public void LoadFile (String text) {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/InputData/"+text+".properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println(e);;
        }
    }

    public HashMap<String,String> GetAllKeyValues(){
        HashMap<String,String> hashMap = new HashMap<>();

        for (String Key: properties.stringPropertyNames()){

            hashMap.put(Key, properties.getProperty(Key) );
        }
        return hashMap;
    }

}
