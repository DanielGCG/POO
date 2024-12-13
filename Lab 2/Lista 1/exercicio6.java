import java.util.*;

public class exercicio6 {
    static class Sorteio {
        int numero;
        static int quantsorteios = 0;

        public Sorteio() {
            Random gerador = new Random();
            Scanner sc = new Scanner(System.in);
            String resposta = "";
            int max = 100;
            int min = 0;

            while (!resposta.equals("=")) {
                quantsorteios++;
                int tentativa = gerador.nextInt(max - min + 1) + min;

                if (min == max) {
                    System.out.println("O número é: " + min);
                    break;
                }

                System.out.println(tentativa + " tentativa é igual (=)? maior (+)? ou menor(-)?");
                resposta = sc.next();

                if (resposta.equals("=")) {
                    System.out.println("Descobri!");
                    break;
                } else if (resposta.equals("+")) {
                    max = tentativa - 1;
                } else if (resposta.equals("-")) {
                    min = tentativa + 1;
                }
            }
            System.out.println("Foram feitas: " + quantsorteios + " sorteios!");
        }
    }

    public static void main(String[] args) {
        Sorteio sort = new Sorteio();
    }
}
