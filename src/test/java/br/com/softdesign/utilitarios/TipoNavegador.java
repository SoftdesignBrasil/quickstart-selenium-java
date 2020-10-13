package br.com.softdesign.utilitarios;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class TipoNavegador {

    public static void utilizarChrome() {
        WebDriverManager.chromedriver().setup();
    }

    public static void utilizarFirefox() {
        WebDriverManager.firefoxdriver().setup();
    }

    public static void utilizarEdge() {
        WebDriverManager.edgedriver().setup();
    }
}
