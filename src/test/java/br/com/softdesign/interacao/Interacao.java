package br.com.softdesign.interacao;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Interacao {

    private final WebDriver webDriver;

    public Interacao(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebElement pesquisarElemento(By tipoPesquisa) {
        return webDriver.findElement(tipoPesquisa);
    }

    public String retornarTextoElemento(By tipoPesquisa) {
        return pesquisarElemento(tipoPesquisa).getText();
    }

    public void clicarElemento(By tipoPesquisa) {
        pesquisarElemento(tipoPesquisa).click();
    }

    private Alert mudarParaAlert() {
        return webDriver.switchTo().alert();
    }

    public String retornarTextoAlerta() {
        Alert alertaPagina = mudarParaAlert();
        String textoAlerta = alertaPagina.getText();
        alertaPagina.accept();
        return textoAlerta;
    }

    public void inserirTextoElemento(By tipoPesquisa, String texto) {
        pesquisarElemento(tipoPesquisa).sendKeys(texto);
    }

    public void selecionarOpcaoCaixaTextoVisivel(By tipoPesquisa, String valorVisivel) {
        new Select(pesquisarElemento(tipoPesquisa)).selectByVisibleText(valorVisivel);
    }
}
