package by.tut.tests;

import by.tut.forms.*;
import by.yandex.forms.YandexMailAuthorizationForm;
import by.yandex.forms.YandexMailMainForm;
import by.yandex.forms.YandexMailForm;
import framework.BaseTest;
import org.testng.annotations.Test;

public class TutByTest extends BaseTest {

  @Test
  public void testing() {
    TutByMainForm tutByMainForm = new TutByMainForm();
    tutByMainForm.openAuthorizationForm();

    TutByAuthorizationForm tutByAuthorizationForm = new TutByAuthorizationForm();
    tutByAuthorizationForm.authorize(parameters.get("login"), parameters.get("password"));
    tutByMainForm.openAuthorizationForm();
    tutByAuthorizationForm.openMail();

    openNewWindow();

    YandexMailMainForm yandexMailMainForm = new YandexMailMainForm();
    yandexMailMainForm.enterMail();

    YandexMailAuthorizationForm yandexMailAuthorizationForm = new YandexMailAuthorizationForm();
    yandexMailAuthorizationForm.authorization(parameters.get("login"), parameters.get("password"));

    YandexMailForm yandexMailForm = new YandexMailForm();
    System.out.println(yandexMailForm.getMailCount());
  }
}
