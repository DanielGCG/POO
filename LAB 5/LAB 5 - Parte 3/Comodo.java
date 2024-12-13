public class Comodo {
    private String tipo;

    // Construtor privado, só pode ser chamado de dentro de Residencia
    private Comodo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    // Classe Residencia terá acesso para criar objetos Comodo
    static Comodo criarComodo(String tipo) {
        return new Comodo(tipo);
    }
}
