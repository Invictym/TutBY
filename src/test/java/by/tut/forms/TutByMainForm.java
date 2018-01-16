package by.tut.forms;

import framework.BaseForm;
import framework.ui.Button;
import framework.ui.Label;
import org.openqa.selenium.By;

public class TutByMainForm extends BaseForm {

  Button bntAuthorization = new Button(By.xpath("//a[contains(@data-target-popup, 'authorize-form')]"), "Authorize form");


  public TutByMainForm() {
    super(By.xpath("//h1[contains(@class, 'header')]/a"), "Main for");
  }

  public void openAuthorizationForm() {
    bntAuthorization.click();
  }
}
