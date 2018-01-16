package by.yandex.forms;

import framework.BaseForm;
import framework.ui.Label;
import org.openqa.selenium.By;

public class YandexMailForm extends BaseForm {

  private final Label lblMailCount = new Label(By.xpath("//span[contains(@class, 'mail-NestedList-Item-Info-Extras')]"), "Input mail count");

  public YandexMailForm() {
    super(By.xpath("//div[contains(@class, 'mail-Layout-Content')]"), "Yandex mail form");
  }

  public int getMailCount() {
    return Integer.parseInt(lblMailCount.getText());
  }
}
