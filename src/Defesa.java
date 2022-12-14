import java.util.Random;
import java.util.Scanner;

public class Defesa {
    String[][] jogada = new String[5][5];
    String nome;
    int cont = 0 ;
    Scanner scan = new Scanner(System.in);
    int coluna, linha;

    Defesa(String[][] jogada, String nome) {
        this.jogada = jogada;
        this.nome = nome;
    }
    public String [][] defesaJogador() {

        do {
            System.out.printf("%s, defina onde estará seu submarino nº%d", nome, cont+1);
            System.out.print("\nDigite a linha: ");
            linha = scan.nextInt();
            System.out.print("Digite a coluna: ");
            coluna = scan.nextInt();
            jogada[linha][coluna] = "N";
            cont++;
        } while (cont<5);
        return jogada;
    }
    public String[][] defesaComputador(){
        int limite = 5;
        Random random = new Random();
        do  {
            linha = random.nextInt(limite);
            coluna = random.nextInt(limite);
            jogada[linha][coluna] = "N";
            cont++;
        } while (cont<5);
        return jogada;
    }
}
