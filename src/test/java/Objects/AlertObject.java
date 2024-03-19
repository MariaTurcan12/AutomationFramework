package Objects;

import java.util.HashMap;

public class AlertObject {

    private String AlertValue;

    public String getAlertValue() {
        return AlertValue;
    }

    public void setAlertValue(String alertValue) {
        AlertValue = alertValue;
    }

    public AlertObject (HashMap<String,String> TestData){
        PrepareData(TestData);

    }

    public void PrepareData (HashMap<String,String> TestData) {


        for (String Key : TestData.keySet()) {
            switch (Key) {
                case "AlertValue":
                    setAlertValue(TestData.get(Key));
                    break;
            }
        }
    }
}
