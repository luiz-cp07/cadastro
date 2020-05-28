package pages;

import org.openqa.selenium.By;

import basePage.BasePage;
import cucumber.api.java.pt.Dado;

public class SearchUser extends BasePage {
  @Dado("^a busca pelo campo: \"([^\"]*)\"$")
  public void buscaNome(String valor) throws Throwable {
  }
}
