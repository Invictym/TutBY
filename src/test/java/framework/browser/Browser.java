package framework.browser;

import org.openqa.selenium.WebDriver;

public class Browser {

  private static volatile Browser browser = null;
  private static WebDriver driver;

  private Browser() {
    driver = BrowserFactoru.init();
  }

  public WebDriver getDriver() {
    return driver;
  }

  public static Browser getBrowser() {
    Browser localBrawser = browser;
    if (localBrawser == null) {
      synchronized (BrowserFactoru.class) {
        localBrawser = browser;
        if (localBrawser == null) {
          browser = new Browser();

        }
      }
    }
    return browser;
  }

  public void navigate(final String url) {
    driver.get(url);
  }
}
