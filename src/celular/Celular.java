package celular;

import internet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Celular implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public void exibirPagina() {
        System.out.println("Exibindo a Pagina\n");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova Aba\n");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a Pagina\n");
    }
    public void tocar() {
        System.out.println("Tocando a Música\n");
    }
    public void pausar() {
        System.out.println("Música Pausada\n");
    }
    public void selecionarMusica() {
        System.out.println("Iniciando a Música selecionada\n");
    }
    public void ligar() {
        System.out.println("Ligando para o Número\n");
    }
    public void atender() {
        System.out.println("Atendendo a Ligação\n");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz\n");
    }
}
