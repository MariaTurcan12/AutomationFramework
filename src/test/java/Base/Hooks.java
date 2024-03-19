package Base;

import Properties.PropertiesUtility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class Hooks extends BaseTest{

    public HashMap<String, String> TestData;

    @Before
    public void PrepareEnvironment () {
        Setup();

        String className = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(className);
        TestData = propertiesUtility.GetAllKeyValues();

    }

    @After
    public void ClearEnvironment(){
        driver.quit();
    }
}
