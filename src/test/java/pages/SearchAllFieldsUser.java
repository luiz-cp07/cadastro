package pages;

import org.openqa.selenium.By;

import org.junit.Assert;
import basePage.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;


public class SearchAllFieldsUser extends BasePage {
  @Dado("^a busca pelos campos: \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
  public void preencherTodosCampos(String nome, String email, String telefone) throws Throwable {
    try {
      driver.findElement(By.id("username")).clear();
      driver.findElement(By.id("username")).sendKeys(nome);
      driver.findElement(By.id("useremail")).clear();
      driver.findElement(By.id("useremail")).sendKeys(email);
      driver.findElement(By.id("userphone")).clear();
      driver.findElement(By.id("userphone")).sendKeys(telefone);
      driver.findElement(By.id("submit")).click();
      Thread.sleep(2000);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @Então("^realizar a busca pelos valores: \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
  public void retornoValores(String nome, String email, String telefone) throws Throwable {
    try {
      Assert.assertEquals(driver.findElement(By.xpath("//td[2]")).getText(), nome);
      Assert.assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), email);
      Assert.assertEquals(driver.findElement(By.xpath("//td[4]")).getText(), telefone);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
