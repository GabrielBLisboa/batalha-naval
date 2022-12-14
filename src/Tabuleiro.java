import java.util.Arrays;

public class Tabuleiro {
    String[][] jogada = new String[5][5];
    String nome;
    Tabuleiro(String[][] jogada, String nome) {
        this.jogada = jogada;
        this.nome = nome;
    }

    public static void iniciaTabuleiro(String[][] jogada) {
        for (String[] row : jogada) {
            Arrays.fill(row, " ");
        }
    }
    public static void imprimeTabuleiro (String[][]jogada, String nome){
        System.out.printf("         %s", nome);
        System.out.println();
        System.out.println("    0   1   2   3   4");
        System.out.printf("A   %s | %s | %s | %s | %s \n", jogada[0][0], jogada[0][1], jogada[0][2], jogada[0][3], jogada[0][4]);
        System.out.println("    ___________________");
        System.out.printf("B   %s | %s | %s | %s | %s \n", jogada[1][0], jogada[1][1], jogada[1][2], jogada[1][3], jogada[1][4]);
        System.out.println("    ___________________");
        System.out.printf("C   %s | %s | %s | %s | %s \n", jogada[2][0], jogada[2][1], jogada[2][2], jogada[2][3], jogada[2][4]);
        System.out.println("    ___________________");
        System.out.printf("D   %s | %s | %s | %s | %s \n", jogada[3][0], jogada[3][1], jogada[3][2], jogada[3][3], jogada[3][4]);
        System.out.println("   ____________________");
        System.out.printf("E   %s | %s | %s | %s | %s \n", jogada[4][0], jogada[4][1], jogada[4][2], jogada[4][3], jogada[4][4]);
        System.out.println();
    }

}