package br.com.softdesign.pagina;

import br.com.softdesign.utilitarios.DadosAleatorios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientePagina extends BasePagina {

    public ClientePagina(WebDriver webDriver) {
        super(webDriver);
    }

    public String selecionarCliente() {
        String clienteRegistrado = DadosAleatorios.retornarClienteRegistradoAletaorio();
        getInteracao().selecionarOpcaoCaixaTextoVisivel(By.id("userSelect"), clienteRegistrado);
        getInteracao().clicarElemento(By.cssSelector("button[type = \"submit\"]"));
        return clienteRegistrado;
    }

    public String verificarNomeClienteLogado() {
        return getInteracao().retornarTextoElemento(By.cssSelector("span[class = \"fontBig ng-binding\"]"));
    }
}
