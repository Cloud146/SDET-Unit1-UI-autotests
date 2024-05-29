package Helpers;

import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsManager {

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized")
                .addArguments("--ignore-certificate-errors")
                .addArguments("--disable-popup-blocking")
                .addArguments("--remote-allow-origins=**")
                .addArguments("--disable-infobars");
//                .addArguments("--incognito");
        options.setCapability("browserVersion", "125.0.6422.78");
        options.setCapability("platformName", "Windows");
        options.setBrowserVersion("125.0.6422.78");
        return options;
    }
}