import java.io.*;
import java.util.*;

public class Inversor {

    public static void main(String[] args) {
        // Nome do arquivo de entrada e saída
        String arquivoEntrada = "semana.txt";
        String arquivoSaida = "inv_semana.txt";

        // Usando try-with-resources para garantir que os arquivos sejam fechados automaticamente
        try (
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))
        ) {
            List<String> linhas = new ArrayList<>();  // Lista para armazenar as linhas lidas

            // Lendo o arquivo linha por linha
            String linha;
            while ((linha = leitor.readLine()) != null) {
                linhas.add(linha);
            }

            // Escrevendo o conteúdo em ordem inversa no novo arquivo
            for (int i = linhas.size() - 1; i >= 0; i--) {
                escritor.write(linhas.get(i));
                escritor.newLine();  // Adiciona uma nova linha após cada linha escrita
            }

            System.out.println("Arquivo invertido criado com sucesso!");

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao processar o arquivo: " + e.getMessage());
        }
    }
}
