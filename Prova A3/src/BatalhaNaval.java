import java.util.InputMismatchException;
import java.util.Scanner;

public class BatalhaNaval {
    
    static final int VAZIO = 0;
    static final int NAVIO = 1;
    static final int ERROU_TIRO = 2;
    static final int ACERTOU_TIRO = 3;
    
    static final int POSICAO_X = 0;
    static final int POSICAO_Y = 1;
    
    
    static String nomeJogador1, nomeJogador2;
    static int tamanhoX, tamanhoY, quantidadeDeNavios, limiteMaximoDeNavios;
    static int tabuleiroJogador1[][], tabuleiroJogador2[][];
    static Scanner input = new Scanner(System.in);
    static int naviosJogador1, naviosJogador2;
    
    public static void obterTamanhoDosTabuleiros() {
        
        for (;;){
            boolean tudoOk = false;
            try {
                System.out.println("Digite a altura do tabuleiro: ");
                tamanhoX = input.nextInt();
                System.out.println("Digite o comprimento do tabuleiro: ");
                tamanhoY = input.nextInt();
                tudoOk = true;
            } catch (InputMismatchException erro) {
                System.out.println("Digite um valor numérico");
            }
            if(tudoOk) {
                break;
            }
        }
    }
    
    public static void obterNomesDosJogadores() {
        System.out.println("Digite o nome do Jogador 1: ");
        nomeJogador1 = input.next();
        System.out.println("Digite o nome do Jogador 2: ");
        nomeJogador2 = input.next();
    }
    
    public static void calcularQuantidadeMaximaDeNaviosNoJogo() {
    limiteMaximoDeNavios = (tamanhoX * tamanhoY) / 3;
    }
    
    public static void iniciandoOsTamanhosDosTabuleiros() {
        tabuleiroJogador1 = retornarNovoTabuleiroVazio();
        tabuleiroJogador2 = retornarNovoTabuleiroVazio();
    }
    
    public static int[][] retornarNovoTabuleiroVazio() {
        return new int[tamanhoX][tamanhoY];
    }
    
    public static void obterQuantidadeDeNaviosNoJogo() {
        System.out.println("Digite a quantidade de navios do jogo:");
        System.out.println("Max: " + limiteMaximoDeNavios + " navios");
        quantidadeDeNavios = input.nextInt();
        if (quantidadeDeNavios < 1 && quantidadeDeNavios > limiteMaximoDeNavios) {
            quantidadeDeNavios = limiteMaximoDeNavios;
        }
    }
    
    public static void instanciarContadoresDeNaviosDosJogadores() {
        naviosJogador1 = quantidadeDeNavios;
        naviosJogador2 = quantidadeDeNavios;
    }
    
}