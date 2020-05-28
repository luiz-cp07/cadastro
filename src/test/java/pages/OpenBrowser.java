package pages;

import org.openqa.selenium.By;

import basePage.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import junit.framework.Assert;

public class OpenBrowser extends BasePage {
  @Dado("^a abertura do browswer \"([^\"]*)\";$")
  public void acessoSistema(String url) throws Throwable {
      try {
        browserChrome();
        driver.get(url);
        Thread.sleep(2500);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
  }

  @Então("^verificar se o sistema está disponível pela \"([^\"]*)\"$")
  public void verificarSistemaDisponivel(String titulo) throws Throwable {
    try {
      Assert.assertEquals(driver.findElement(By.xpath("//html/body/div/h1/a")).getText(), titulo);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }    
}
