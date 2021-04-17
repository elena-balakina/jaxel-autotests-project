package cloud.autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/testdata.properties"
})
public interface TestDataConfig extends Config {
    @Key("web.url")
    String webUrl();

    @Key("api.url")
    String apiUrl();

    @Key("user.name")
    String userName();

    @Key("user.email")
    String userEmail();

}
