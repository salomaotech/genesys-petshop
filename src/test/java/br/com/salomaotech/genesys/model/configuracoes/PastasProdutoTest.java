package br.com.salomaotech.genesys.model.configuracoes;

import br.com.salomaotech.sistema.algoritmos.ArquivoPropriedade;
import br.com.salomaotech.sistema.algoritmos.CaminhoArquivoNormalizado;
import br.com.salomaotech.sistema.jpa.ConfiguracoesConexao;
import static java.util.Objects.isNull;
import java.util.Properties;
import org.junit.Test;
import static org.junit.Assert.*;

public class PastasProdutoTest {

    private String pastaRaiz;

    public PastasProdutoTest() {

        ConfiguracoesConexao configuracoesConexao = new ConfiguracoesConexao();

        if (!isNull(configuracoesConexao.getPropriedades())) {

            Properties propriedades = new ArquivoPropriedade(configuracoesConexao.getPathArquivo()).getProperties();
            pastaRaiz = "//" + propriedades.get("servidor");

        } else {

            pastaRaiz = System.getProperty("user.dir");

        }

        pastaRaiz = CaminhoArquivoNormalizado.obterCaminhoArquivoNormalizado(pastaRaiz + "/target/arquivos");

    }

    @Test
    public void testGetPastaRaiz() {

        System.out.println("Testando classe PastasCliente método: getPastaRaiz");
        assertEquals(true, new PastasProduto("1").getPastaRaiz().equals(CaminhoArquivoNormalizado.obterCaminhoArquivoNormalizado((pastaRaiz + "/produto/1"))));

    }

    @Test
    public void testGetSubPastaDeFotosDoPerfil() {

        System.out.println("Testando classe PastasCliente método: getSubPastaDeFotosDoPerfil");
        assertEquals(true, new PastasProduto("1").getSubPastaDeFotosDoPerfil().equals(CaminhoArquivoNormalizado.obterCaminhoArquivoNormalizado((pastaRaiz + "/produto/1/foto_produto"))));

    }

    @Test
    public void testGetSubPastaDeTemporarios() {

        System.out.println("Testando classe PastasCliente método: getSubPastaDeTemporarios");
        assertEquals(true, new PastasProduto("1").getSubPastaDeTemporarios().equals(CaminhoArquivoNormalizado.obterCaminhoArquivoNormalizado((pastaRaiz + "/produto/1/temporario"))));

    }

}
