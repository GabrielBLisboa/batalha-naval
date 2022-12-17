import java.util.Scanner;

public class Entrada {

    static String coordenadaLetraNum;
    static int[] coordenadaNumNum;
    static Scanner scan = new Scanner(System.in);

    public static int[] leCoordenada(){
        System.out.print("\nDigite a coordenada: ");

        try {
            coordenadaLetraNum = scan.next();
            char letraDaCoordenada = coordenadaLetraNum.toLowerCase().charAt(0);
            int linha = letraDaCoordenada-'a';
            System.out.println(linha);

            int coluna = Integer.parseInt(coordenadaLetraNum.substring(1));
            System.out.println(coluna);

            if ((linha >= 0 && linha < 5) || (coluna >= 0 && coluna < 5)) {
                coordenadaNumNum = new int[]{linha,coluna};
            }
            else {
                Tratamento.erroDeEntrada();
            }

        } catch (Exception e){
            Tratamento.erroDeEntrada();
        }

        return coordenadaNumNum;
    }


}
