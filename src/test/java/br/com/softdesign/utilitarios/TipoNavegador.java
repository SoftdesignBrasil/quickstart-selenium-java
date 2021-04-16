package br.com.softdesign.utilitarios;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class TipoNavegador {

    public static void utilizarDriverNavegador(Navegador navegador) {

        switch (navegador) {
            case CHROME:
                utilizarDriverNavegador();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                break;
            case HANDLESS_PHANTOM_JS:
                WebDriverManager.phantomjs().setup();
                break;
        }
    }

    public static void utilizarDriverNavegador() {
        WebDriverManager.chromedriver().setup();
    }
}
