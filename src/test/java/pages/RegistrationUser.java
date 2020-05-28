package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import basePage.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class RegistrationUser extends BasePage {
  @Dado("^o clique no botão Add usuários;$")
  public void clicarBntAddUsuario() throws Throwable {
    try {
      driver.findElement(By.linkText("Add Usuários")).click();
      Thread.sleep(2000);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @E("^preencher todos os campos: \\\"([^\\\"]*)\\\" \\\"([^\\\"]*)\\\" \\\"([^\\\"]*)\\\"$")
  public void preencherTodosOsCampos(String nome, String email, String telefone) throws Throwable {
    try {
      driver.findElement(By.id("username")).clear();
      driver.findElement(By.id("username")).sendKeys(nome);
      driver.findElement(By.id("useremail")).clear();
      driver.findElement(By.id("useremail")).sendKeys(email);
      driver.findElement(By.id("userphone")).clear();
      driver.findElement(By.id("userphone")).sendKeys(telefone);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @E("^clicar no botão Adcionar$")
  public void clicarBntAdcionar() throws Throwable {
    try {
      driver.findElement(By.id("submit")).click();
      Thread.sleep(2000);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @Então("^realizar a busca pelos valores: (\\d+) \"([^\"]*)\"$")
  public void verificarUsuarioCadastrado(int id, String valor) throws Throwable {
    try {
      switch (id) {
        case 1:
          driver.findElement(By.id("userphone")).sendKeys(valor);
          driver.findElement(By.id("submit")).click();
          Thread.sleep(2000);
          Assert.assertEquals(driver.findElement(By.xpath("//td[4]")).getText(), valor);
          break;
        case 2:
          driver.findElement(By.id("username")).sendKeys(valor);
          driver.findElement(By.id("submit")).click();
          Thread.sleep(2000);
          Assert.assertEquals(driver.findElement(By.xpath("//td[2]")).getText(), valor);
          break;
        case 3:
          driver.findElement(By.id("useremail")).sendKeys(valor);
          driver.findElement(By.id("submit")).click();
          Thread.sleep(2000);
          Assert.assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), valor);
          break;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
