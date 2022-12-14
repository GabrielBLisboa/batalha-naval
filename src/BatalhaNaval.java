import java.util.Arrays;
import java.util.Scanner;
public class BatalhaNaval {
    static String[][] posJogador = new String[5][5];
    static String[][] posPC = new String[5][5];
    static String[][] marcador = new String[5][5];
    static int pontosJogador;
    static int pontosComputador;

    public static void main(String[] args) {

        Tabuleiro tabuleiroJogador = new Tabuleiro(posJogador, "Jogador");
        Tabuleiro tabuleiroComputador = new Tabuleiro(posPC, "Computador");


        Tabuleiro.iniciaTabuleiro(posJogador);
        Tabuleiro.iniciaTabuleiro(posPC);
        Tabuleiro.iniciaTabuleiro(marcador);

        Tabuleiro.imprimeTabuleiro(posJogador, tabuleiroJogador.nome);
        Defesa Jogador = new Defesa(posJogador, "Jogador");
        Defesa PC = new Defesa(posPC, "Computador");

        posJogador = Jogador.defesaJogador();
        System.out.println("\nSeu tabuleiro está assim:");
        Tabuleiro.imprimeTabuleiro(posJogador, tabuleiroJogador.nome);


        posPC = PC.defesaComputador();
        System.out.println("\nO tabuleiro do computador está assim:");
        Tabuleiro.imprimeTabuleiro(posPC, tabuleiroComputador.nome);

        System.out.println("\nAgora vamos atacar:");
        Tabuleiro.imprimeTabuleiro(marcador, tabuleiroComputador.nome);
        Ataque ataque = new Ataque();

        while ((pontosJogador != 5) | (pontosComputador !=5)){
            pontosJogador += ataque.ataqueJogador(marcador);
            pontosComputador += ataque.ataqueComputador(posJogador);
            System.out.println("\nPontos do Jogador: " + pontosJogador);
            System.out.println("Pontos do Computador: " + pontosComputador);
        }

    }

}


