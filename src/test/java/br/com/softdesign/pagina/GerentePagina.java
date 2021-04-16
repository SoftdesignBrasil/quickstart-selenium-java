package br.com.softdesign.pagina;

import br.com.softdesign.utilitarios.DadosAleatorios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GerentePagina extends BasePagina {

    public GerentePagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void adicionarNovoCliente() {
        getInteracao().clicarElemento(By.cssSelector("button[ ng-click = \"addCust()\"]"));
        getInteracao().inserirTextoElemento(By.cssSelector("input[ng-model = \"fName\"]"), DadosAleatorios.gerarNomeAleatorio());
        getInteracao().inserirTextoElemento(By.cssSelector("input[ng-model = \"lName\"]"), DadosAleatorios.gerarSobreNomeAleatorio());
        getInteracao().inserirTextoElemento(By.cssSelector("input[ng-model = \"postCd\"]"), DadosAleatorios.gerarCodigoPostalAleatorio());
        getInteracao().clicarElemento(By.cssSelector("button[type = \"submit\"]"));
    }

    public String retornarTextoAlertaUsuarioAdicionado() {
        return getInteracao().retornarTextoAlerta();
    }
}
