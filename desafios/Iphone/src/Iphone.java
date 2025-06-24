import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println( "Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println( "Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println( "Iniciando correio voz...");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println( "Exibindo pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println( "Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println( "Atualizando pagina...");
    }

    @Override
    public void tocar() {
        var musica = "Seether - Never Leave";
        System.out.println("Reproduzindo musica " + musica);
    }

    @Override
    public void pausar() {
        System.out.println( "Musica pausada ");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println( "Musica selecionada " + musica);
    }
}
