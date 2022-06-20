public static void Main(String[] args) {
        obterNomesDosJogadores();
        obterTamanhoDosTabuleiros();  
        calcularQuantidadeMaximaDeNaviosNoJogo();
        iniciandoOsTamanhosDosTabuleiros();
        obterQuantidadeDeNaviosNoJogo();
        instanciarContadoresDeNaviosDosJogadores();
        inserirOsNaviosNosTabuleirosDosJogadores();
        boolean jogoAtivo = true;
        do{
            exibirTabuleirosDosJogadores();  
            if (acaoDoJogador()) {
                if (naviosJogador2 <= 0) {
                    System.out.println(nomeJogador1 + " venceu o jogo!");
                    break;
                }
                // Verifico fim do jogo
                acaoDoComputador();
                if (naviosJogador1 <= 0) {
                    System.out.println(nomeJogador2 + " venceu o jogo!");
                    break;
                }
            }

        }while (jogoAtivo);
        exibirTabuleirosDosJogadores();
        input.close();
               
    }

}