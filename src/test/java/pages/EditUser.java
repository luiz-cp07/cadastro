package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import basePage.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;


public class EditUser extends BasePage {
  @Dado("^realizar a edição do campo: \"([^\"]*)\"$")
  public void realizarEdicaoCampoEmail(String email) throws Throwable {
    try {
      driver.findElement(By.linkText("Editar")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("useremail")).clear();
      driver.findElement(By.id("useremail")).sendKeys(email);
      driver.findElement(By.id("submit")).click();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @Então("^valida se é exibida a mensagem de alerta \"([^\"]*)\"$")
  public void validarMensagemAlertaEdicao(String msg) throws Throwable {
    try {
      Assert.assertEquals(driver.findElement(By.xpath("//div[2]/div")).getText(), msg);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}