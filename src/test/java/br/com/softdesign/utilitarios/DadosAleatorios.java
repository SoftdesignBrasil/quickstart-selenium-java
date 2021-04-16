package br.com.softdesign.utilitarios;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DadosAleatorios {

    private DadosAleatorios() {
    }

    private static final Faker FALSO = new Faker(new Locale("pt-br"));

    public static String gerarNomeAleatorio() {
        return FALSO.name().firstName();
    }

    public static String gerarSobreNomeAleatorio() {
        return FALSO.name().lastName();
    }

    public static String gerarCodigoPostalAleatorio() {
        return FALSO.address().zipCode();
    }

    public static String retornarClienteRegistradoAletaorio() {
        String[] usuariosRegistrados = {"Hermoine Granger", "Harry Potter",
                "Ron Weasly", "Albus Dumbledore", "Neville Longbottom"};

        return usuariosRegistrados[new Random().nextInt(usuariosRegistrados.length)];
    }
}
