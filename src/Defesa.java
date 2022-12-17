import java.util.Random;
import java.util.Scanner;

public class Defesa {
    static String[][] jogada = new String[5][5];
    String nome;
    int cont = 0 ;
    int[] coordenada;
    Scanner scan = new Scanner(System.in);
    int coluna, linha;

    Defesa(String[][] jogada, String nome) {
        Defesa.jogada = jogada;
        this.nome = nome;
    }
    public String [][] defesaJogador() {

        do {
            coordenada = Entrada.leCoordenada();
            if (Tratamento.mesmoLugar(coordenada[0],coordenada[1])){
                cont++;
            } else Tratamento.erroDeEntrada();
        } while (cont<5);
        return jogada;
    }
    public String[][] defesaComputador(){
        int limite = 5;
        Random random = new Random();
        do  {

            linha = random.nextInt(limite);
            coluna = random.nextInt(limite);
            if (Tratamento.mesmoLugar(linha, coluna)){
                cont++;
            } else defesaComputador();
        } while (cont<5);
        return jogada;
    }
}
