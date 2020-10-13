package br.com.softdesign.utilitarios;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DadosAleatorios {

    public static String nomeAletario() {
        List<String> nomes = Arrays.asList("José", "Maria", "João", "Astrogildo");
        return nomes.get(new Random().nextInt(nomes.size()));
    }

    public static String sobreNomeAleatorio() {
        List<String> sobrenomes = Arrays.asList("Costa", "Figueredo", "Lima", "Freitas");
        return sobrenomes.get(new Random().nextInt(sobrenomes.size()));
    }

    public static String codigoPostalAleatorio() {
        List<String> codigosPostais = Arrays.asList("1234", "5678", "9841", "6781");
        return codigosPostais.get(new Random().nextInt(codigosPostais.size()));
    }

    public static String clienteRegistradoAletaorio() {
        List<String> usuariosRegistrados = Arrays.asList("Hermoine Granger", "Harry Potter",
                "Ron Weasly", "Albus Dumbledore", "Neville Longbottom");
        return usuariosRegistrados.get(new Random().nextInt(usuariosRegistrados.size()));
    }
}
