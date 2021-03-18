package mandatory.cache.objects;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class User {

    // simulates a slow call
    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        String generatedString = RandomStringUtils.randomAlphabetic(981);

        return "NeverGonnaGiveYouUp" + generatedString;
    }
}
