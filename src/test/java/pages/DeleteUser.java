package pages;

import org.openqa.selenium.By;

import basePage.BasePage;
import cucumber.api.java.pt.Dado;

public class DeleteUser extends BasePage {
  @Dado("^clicar no botão deletar$")
  public void clicarBntDeletar() throws Throwable {
    try {
      driver.findElement(By.linkText("Deletar")).click();
      Thread.sleep(2000);
      driver.switchTo().alert().accept();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
