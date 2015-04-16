package testlink.models;

import org.apache.commons.lang3.RandomStringUtils;


public class TestSuite {
    public String name = getCorrectName();
    public String details = "Some details";

    public String getCorrectName(){
        name = RandomStringUtils.randomAlphabetic(10);
        return name;
    }
}
