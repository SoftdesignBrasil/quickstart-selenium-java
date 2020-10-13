package br.com.softdesign.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicialPagina extends BasePagina {

    public InicialPagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void clicarBotaoLoginGerente() {
        getInteracao().clicarElemento(By.cssSelector("button[ ng-click = \"manager()\""));
    }

    public void clicarBotaoLoginCliente() {
        getInteracao().clicarElemento(By.cssSelector("button[ ng-click = \"customer()\"]"));
    }
}
