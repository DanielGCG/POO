public class Driver {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Daniel", "Gerente", 2005, 35, null, 12000);
        try {
            // Aqui ocorre a exceção
            f1.setChefe(f1);
        } catch (ChefeInvalidoException e) {
            // Tratamento da exceção
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
