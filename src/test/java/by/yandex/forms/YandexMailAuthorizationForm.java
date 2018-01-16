package by.yandex.forms;

import framework.BaseForm;
import framework.ui.Button;
import framework.ui.TextBox;
import org.openqa.selenium.By;

public class YandexMailAuthorizationForm extends BaseForm {

  private final TextBox tbxLogin = new TextBox(By.xpath("//input[@name='login']"), "Login text box");
  private final TextBox tbxPassword = new TextBox(By.xpath("//input[@name='passwd']"), "Password text box");
  private final Button btnAuthorization = new Button(By.xpath("//button[@type='submit']"), "Authorization button");


  public YandexMailAuthorizationForm() {
    super(By.xpath("//div[contains(@class, 'passport-ScreenBox-Item_current')]"), "Yandex authorization from");
  }

  public void authorization(String login, String password) {
    tbxLogin.sendKey(login);
    tbxPassword.sendKey(password);
    btnAuthorization.click();
  }
}
