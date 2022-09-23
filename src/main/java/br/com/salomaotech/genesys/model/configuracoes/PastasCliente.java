package br.com.salomaotech.genesys.model.configuracoes;

public class PastasCliente {

    private final String pastaRaiz;
    private final String subPastaDeFotosDoPerfil;
    private final String subPastaDeTemporarios;

    /**
     * Construtor
     *
     * @param idCliente ID do cliente
     */
    public PastasCliente(String idCliente) {

        /* pasta raiz */
        pastaRaiz = new PastasSistema().getPastaRaiz() + "cliente/" + idCliente + "/";

        /* subpastas */
        subPastaDeFotosDoPerfil = pastaRaiz + "foto_perfil/";
        subPastaDeTemporarios = pastaRaiz + "temporario/";

    }

    public String getPastaRaiz() {
        return pastaRaiz;
    }

    public String getSubPastaDeFotosDoPerfil() {
        return subPastaDeFotosDoPerfil;
    }

    public String getSubPastaDeTemporarios() {
        return subPastaDeTemporarios;
    }

}
