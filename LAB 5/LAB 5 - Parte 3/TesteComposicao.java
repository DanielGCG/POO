public class TesteComposicao {
    public static void main(String[] args) {
        // Criando uma residência com um cômodo inicial
        Residencia residencia = new Residencia("Sala");

        // Adicionando mais cômodos
        residencia.adicionarComodo("Cozinha");
        residencia.adicionarComodo("Quarto");

        // Listar todos os cômodos
        residencia.listarComodos();
    }
}
