public class Restaurante implements Conveniado {
    private final String CNPJ;
    private final String nome;

    public Restaurante(String CNPJ, String nome) {
        this.CNPJ = CNPJ;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void notify(LazyObserver cliente) {
        // Aqui você pode adicionar lógica específica de desconto para o restaurante
        cliente.update(true); // Exemplo: sempre concede desconto
    }
}
