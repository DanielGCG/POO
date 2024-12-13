import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int quantidade = 0;
        double nota;

        System.out.println("Digite as notas (digite -1 para encerrar):");

        while ((nota = scan.nextDouble()) != -1) {
            total += nota;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = total / quantidade;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }
        scan.close();
    }
}