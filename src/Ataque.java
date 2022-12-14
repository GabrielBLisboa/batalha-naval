import java.util.Random;
import java.util.Scanner;

public class Ataque {
    String[][] jogada = new String[5][5];
    Scanner scan = new Scanner(System.in);
    int coluna, linha;


    public int ataqueJogador(String[][] pos) {
        int pontos=0;
        System.out.println("\nDigite onde deseja atacar");
        System.out.print("\nDigite a linha: ");
        linha = scan.nextInt();
        System.out.print("Digite a coluna: ");
        coluna = scan.nextInt();
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
            jogada[linha][coluna] = "N";
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