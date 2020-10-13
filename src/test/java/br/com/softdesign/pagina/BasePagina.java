package br.com.softdesign.pagina;

import br.com.softdesign.interacao.Interacao;
import org.openqa.selenium.WebDriver;

public abstract class BasePagina {

    private final Interacao interacao;

    public BasePagina(WebDriver webDriver) {
        this.interacao = new Interacao(webDriver);
    }

    protected Interacao getInteracao() {
        return this.interacao;
    }
}
