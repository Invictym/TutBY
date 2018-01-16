package by.yandex.forms;

import framework.BaseForm;
import framework.ui.Button;
import org.openqa.selenium.By;

public class YandexMailMainForm extends BaseForm {

  private final Button btnEnterMail = new Button(By.xpath("//a[contains(@class, 'Form_Button-enter')]"), "Enter yandex mail");

  public YandexMailMainForm() {
    super(By.xpath("//div[contains(@class, 'auth-Form')]"), "Yandex mail main form");
  }

  public void enterMail() {
    btnEnterMail.click();
  }
}
