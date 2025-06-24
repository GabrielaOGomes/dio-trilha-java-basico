import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

import java.util.Scanner;

public class Program {

    private final static Scanner sc = new Scanner(System.in);
    private final static AparelhoTelefonico aparelhoTelefonico = new Iphone();
    private final static ReprodutorMusical reprodutorMusical = new Iphone();
    private final static NavegadorInternet navegadorInternet = new Iphone();

    public static void main(String[] args) {

        var option = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("================================");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar correio voz");
            System.out.println("4 - Reproduzir musica");
            System.out.println("5 - Pausar musica");
            System.out.println("6 - Selecionar musica");
            System.out.println("7 - Exibir pagina");
            System.out.println("8 - Adicionar nova aba");
            System.out.println("9 - Atualizar pagina");
            System.out.println("0 - Sair");
            option = sc.nextInt();

            switch (option) {
                case 1 -> aparelhoTelefonico.ligar("12-354876905");
                case 2 -> aparelhoTelefonico.atender();
                case 3 -> aparelhoTelefonico.iniciarCorreioVoz();
                case 4 -> reprodutorMusical.tocar();
                case 5 -> reprodutorMusical.pausar();
                case 6 -> reprodutorMusical.selecionarMusica("Seether - Never Leave");
                case 7 -> navegadorInternet.exibirPagina("https://www.youtube.com/");
                case 8 -> navegadorInternet.adicionarNovaAba();
                case 9 -> navegadorInternet.atualizarPagina();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }
        }while (option != 0);
    }
}