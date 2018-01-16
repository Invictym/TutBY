package by.tut.forms;

import framework.BaseForm;
import framework.ui.Button;
import framework.ui.Label;
import framework.ui.TextBox;
import org.openqa.selenium.By;

public class TutByAuthorizationForm extends BaseForm {

  private final TextBox tbxLogin = new TextBox(By.xpath("//div[@data-popup= 'authorize-form']//input[@name='login']"), "Login text box");
  private final TextBox tbxPassword = new TextBox(By.xpath("//div[@data-popup= 'authorize-form']//input[@name='password']"), "Password text box");
  private final Button btnAuthorize = new Button(By.xpath("//div[@data-popup= 'authorize-form']//input[contains(@class,'auth')]"), "Authorize");
  private final Label lblMail = new Label(By.xpath("//div[@data-popup= 'authorize-form']//a[contains(text(), 'Почта')]"), "Mai");

  public TutByAuthorizationForm() {
    super(By.xpath("//div[contains(@data-popup, 'authorize-form')]"), "Authorization form");
  }

  public void openMail() {
    lblMail.click();
  }

  public void authorize(String login, String password) {
    tbxLogin.sendKey(login);
    tbxPassword.sendKey(password);
    btnAuthorize.click();
  }
}
