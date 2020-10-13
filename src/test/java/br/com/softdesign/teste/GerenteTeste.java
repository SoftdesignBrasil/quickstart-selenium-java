package br.com.softdesign.teste;

import br.com.softdesign.pagina.GerentePagina;
import br.com.softdesign.pagina.InicialPagina;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GerenteTeste extends BaseTeste {

    private InicialPagina inicialPagina;
    private GerentePagina gerentePagina;

    @Override
    public void iniciarConfiguracao() {
        super.iniciarConfiguracao();
        inicialPagina = new InicialPagina(getWebDriver());
        gerentePagina = new GerentePagina(getWebDriver());
    }

    @Test
    public void validarMensagemUsuarioCriadoSucesso() {
        inicialPagina.clicarBotaoLoginGerente();
        gerentePagina.adicionarNovoCliente();
        assertTrue(gerentePagina.retornarTextoAlertaUsuarioAdicionado().
                contains("Customer added successfully with customer id :"));
    }
}
