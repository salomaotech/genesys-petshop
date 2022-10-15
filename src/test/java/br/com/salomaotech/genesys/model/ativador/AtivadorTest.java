package br.com.salomaotech.genesys.model.ativador;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Objects.isNull;
import java.util.Properties;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtivadorTest {

    private final Ativador ativador = new Ativador();

    public AtivadorTest() {

        try {

            new Properties().store(new FileOutputStream(ativador.getPathArquivoCompleto()), null);

        } catch (IOException ex) {

        }

    }

    @Test
    public void testGetDiasUsados() {

        System.out.println("Testando classe ativador metodo: getDiasUsados");
        assertEquals(true, ativador.getDiasUsados() == 1);

    }

    @Test
    public void testGetDiasRestantes() {

        System.out.println("Testando classe ativador metodo: getDiasRestantes");
        assertEquals(true, ativador.getDiasRestantes() == 7);

    }

    @Test
    public void testIsExpirou() {

        System.out.println("Testando classe ativador metodo: isExpirou");
        assertEquals(false, ativador.isExpirou());

    }

    @Test
    public void testIsAtivado() {

        System.out.println("Testando classe ativador metodo: isAtivado");
        assertEquals(false, ativador.isAtivado());

    }

    @Test
    public void testGetChaves() {

        ArrayList chaves = ativador.getChaves();

        System.out.println("Testando classe ativador metodo: getChaves etapa 01 primeira chave");
        assertEquals(true, chaves.contains("18db80fa878fdee68641bb5317712b3d"));

        System.out.println("Testando classe ativador metodo: getChaves etapa 02 ultima chave");
        assertEquals(true, chaves.contains("ef7aca675c9ac5f23d01826f9e78d926"));

        System.out.println("Testando classe ativador metodo: getChaves etapa 03 chave inválida");
        assertEquals(false, chaves.contains("123456"));

        System.out.println("Testando classe ativador metodo: getChaves etapa 04 chave inválida");
        assertEquals(false, chaves.contains(""));

        System.out.println("Testando classe ativador metodo: getChaves etapa 05 numero de chaves total");
        assertEquals(true, chaves.size() == 10001);

    }

    @Test
    public void testAtivar() {

        System.out.println("Testando classe ativador metodo: ativar etapa 01 chave valida");
        assertEquals(true, ativador.ativar("ef7aca675c9ac5f23d01826f9e78d926"));

        System.out.println("Testando classe ativador metodo: ativar etapa 01 chave valida");
        assertEquals(false, ativador.ativar("123456"));

    }

    @Test
    public void testGetPathArquivoCompleto() {

        System.out.println("Testando classe ativador metodo: getPathArquivoCompleto");
        assertEquals(false, isNull(ativador.getPathArquivoCompleto()));

    }

}