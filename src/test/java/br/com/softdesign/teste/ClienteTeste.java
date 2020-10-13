package br.com.softdesign.teste;

import br.com.softdesign.pagina.ClientePagina;
import br.com.softdesign.pagina.InicialPagina;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTeste extends BaseTeste {

    private InicialPagina inicialPagina;
    private ClientePagina clientePagina;

    @Override
    public void iniciarConfiguracao() {
        super.iniciarConfiguracao();
        inicialPagina = new InicialPagina(getWebDriver());
        clientePagina = new ClientePagina(getWebDriver());
    }

    @Test
    public void validarLoginCliente() {
        inicialPagina.clicarBotaoLoginCliente();
        assertEquals(clientePagina.selecionarCliente(), clientePagina.verificarNomeClienteLogado());
    }
}
