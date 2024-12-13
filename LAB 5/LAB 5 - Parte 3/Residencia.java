import java.util.ArrayList;
public class Residencia {
    private ArrayList<Comodo> comodos;

    // Construtor da Residencia, requer pelo menos um cômodo
    public Residencia(String primeiroComodo) {
        comodos = new ArrayList<>();
        adicionarComodo(primeiroComodo);  // Sempre cria o primeiro cômodo
    }

    public void adicionarComodo(String tipoComodo) {
        comodos.add(Comodo.criarComodo(tipoComodo));
    }

    public void listarComodos() {
        System.out.println("Cômodos da residência:");
        for (Comodo comodo : comodos) {
            System.out.println("- " + comodo.getTipo());
        }
    }
}
