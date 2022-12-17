import java.util.Random;
import java.util.Scanner;

public class Ataque {
    String[][] jogada = new String[5][5];
    Scanner scan = new Scanner(System.in);
    int[] coordenada;

    public int ataqueJogador(String[][] pos) {
        int pontos=0;
        System.out.println("\nDigite onde deseja atacar");
        coordenada = Entrada.leCoordenada();
        int coluna = coordenada[1], linha = coordenada[0];
        if (BatalhaNaval.posPC[linha][coluna].equals("N")){
            pos[linha][coluna] = "*";
            Tabuleiro.imprimeTabuleiro(pos, "Ataque");
            pontos=1;
        } else {
            pos[linha][coluna] = "-";
            Tabuleiro.imprimeTabuleiro(pos, "Ataque");
        }
        return pontos;
    }
    public int ataqueComputador(String[][] pos){
        int linha, coluna;
        int limite = 5;
        int pontos=0;
        Random random = new Random();
            linha = random.nextInt(limite);
            coluna = random.nextInt(limite);

        if (pos[linha][coluna].equals("N")){
            pos[linha][coluna] = "*";
            Tabuleiro.imprimeTabuleiro(pos, "Defesa");
            pontos=1;

        } else {
            pos[linha][coluna] = "-";
            Tabuleiro.imprimeTabuleiro(pos, "Defesa");
        }
        return pontos;
    }
}