package br.com.softdesign.teste;

import br.com.softdesign.utilitarios.TipoNavegador;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTeste {

    private WebDriver webDriver;

    protected WebDriver getWebDriver() {
        return this.webDriver;
    }

    @BeforeClass
    public static void configurarWebDriver() {
        TipoNavegador.utilizarChrome();
    }

    @Before
    public void iniciarConfiguracao() {
        this.webDriver = new ChromeDriver();
        this.webDriver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        this.webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        this.webDriver.manage().window().fullscreen();
    }

    @After
    public void fecharNavegador() {
        this.webDriver.quit();
    }
}
