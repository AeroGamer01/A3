public class exibirTabuleiro(private static final int ERROU_TIRO = 0;
private static final int ACERTOU_TIRO = 0;
private static final int VAZIO = 0;
String nomeDoJogador, int[][] tabuleiro, boolean seuTabuleiro) {
        System.out.println("|----- " + nomeDoJogador + " -----|");
        exibirNumerosDasColunasDosTabuleiros();
        String linhaDoTabuleiro = "";
        char letraDaLinha = 65;
        for(int[] linha : tabuleiro) {
            linhaDoTabuleiro = (letraDaLinha++) + " |";           
            
            for (int coluna : linha) {
                switch(coluna) {
                    case VAZIO : 
                        linhaDoTabuleiro += " |";
                        break;
                    case NAVIO : 
                        if (seuTabuleiro) {
                            linhaDoTabuleiro += "N|";
                            break;
                        } else {
                            linhaDoTabuleiro += " |";
                            break;
                        }
                    case ERROU_TIRO : 
                        linhaDoTabuleiro += "X|";
                        break;
                        
                    case ACERTOU_TIRO : 
                        linhaDoTabuleiro += "D|";
                        break; 
                }
            }
            System.out.println(linhaDoTabuleiro);
        }
    }
	
}
