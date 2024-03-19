package Objects;

import java.util.HashMap;

public class RegisterObject {

    private String FirstNameValue;
    private String LastNameValue;
    private String AddressValue;
    private String EmailValue;
    private String PhoneNrValue;
    private String YearValue;
    private String MonthValue;
    private String DayValue;
    private String LanguagesValues;
    private String CountryValue;
    private String SkillsValue;
    private String PasswordValue;
    private String ConfirmPasswordValue;


    public RegisterObject (HashMap<String, String> TestData){
        PrepareData(TestData);
    }

    public void PrepareData(HashMap<String, String> TestData){
        for (String Key : TestData.keySet()){
            switch (Key){
                case "FirstNameValue":
                    setFirstNameValue(TestData.get(Key));
                    break;
                case "LastNameValue":
                    setLastNameValue(TestData.get(Key));
                    break;
                case "AddressValue":
                    setAddressValue(TestData.get(Key));
                    break;
                case "EmailValue":
                    setEmailValue(TestData.get(Key));
                    break;
                case "PhoneNrValue":
                    setPhoneNrValue(TestData.get(Key));
                    break;
                case "YearValue":
                    setYearValue(TestData.get(Key));
                    break;
                case "MonthValue":
                    setMonthValue(TestData.get(Key));
                    break;
                case "DayValue":
                    setDayValue(TestData.get(Key));
                    break;
                case "LanguagesValues":
                    setLanguagesValues(TestData.get(Key));
                    break;
                case "CountryValue":
                    setCountryValue(TestData.get(Key));
                    break;
                case "SkillsValue":
                    setSkillsValue(TestData.get(Key));
                    break;
                case "PasswordValue":
                    setPasswordValue(TestData.get(Key));
                    break;
                case "ConfirmPasswordValue":
                    setConfirmPasswordValue(TestData.get(Key));
                    break;
            }
        }
    }

    public String getFirstNameValue() {
        return FirstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        FirstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return LastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        LastNameValue = lastNameValue;
    }

    public String getAddressValue() {
        return AddressValue;
    }

    public void setAddressValue(String addressValue) {
        AddressValue = addressValue;
    }

    public String getEmailValue() {
        return EmailValue;
    }

    public void setEmailValue(String emailValue) {
        EmailValue = emailValue;
    }

    public String getPhoneNrValue() {
        return PhoneNrValue;
    }

    public void setPhoneNrValue(String phoneNrValue) {
        PhoneNrValue = phoneNrValue;
    }

    public String getYearValue() {
        return YearValue;
    }

    public void setYearValue(String yearValue) {
        YearValue = yearValue;
    }

    public String getMonthValue() {
        return MonthValue;
    }

    public void setMonthValue(String monthValue) {
        MonthValue = monthValue;
    }

    public String getDayValue() {
        return DayValue;
    }

    public void setDayValue(String dayValue) {
        DayValue = dayValue;
    }

    public String getLanguagesValues() {
        return LanguagesValues;
    }

    public void setLanguagesValues(String languagesValues) {
        LanguagesValues = languagesValues;
    }

    public String getCountryValue() {
        return CountryValue;
    }

    public void setCountryValue(String countryValue) {
        CountryValue = countryValue;
    }

    public String getSkillsValue() {
        return SkillsValue;
    }

    public void setSkillsValue(String skillsValue) {
        SkillsValue = skillsValue;
    }

    public String getPasswordValue() {
        return PasswordValue;
    }

    public void setPasswordValue(String passwordValue) {
        PasswordValue = passwordValue;
    }

    public String getConfirmPasswordValue() {
        return ConfirmPasswordValue;
    }

    public void setConfirmPasswordValue(String confirmPasswordValue) {
        ConfirmPasswordValue = confirmPasswordValue;
    }
}
