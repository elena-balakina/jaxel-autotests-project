package cloud.autotests.tests;

import cloud.autotests.config.TestDataConfig;
import org.aeonbits.owner.ConfigFactory;

public class TestData {
    private static TestDataConfig getTestData() {
        return ConfigFactory.newInstance().create(TestDataConfig.class, System.getProperties());
    }

    public static String getWebUrl() {
        return getTestData().webUrl();
    }

    public static String getApiUrl() {
        return getTestData().apiUrl();
    }

    public static String getUserName() {
        return getTestData().userName();
    }

    public static String getUserEmail() {
        return getTestData().userEmail();
    }
}
