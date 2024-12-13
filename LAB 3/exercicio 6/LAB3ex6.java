public class LAB3ex6 {
    public static void main(String[] args) {
        // Criando um funcionário chefe (sem chefe próprio)
        Funcionario f1 = new Funcionario("Daniel", "Gerente", 2005, 35, null, 12000);

        // Criando um funcionário com um chefe
        Funcionario f2 = new Funcionario("Pedrinho", "Caixa", 2034, 25, f1, 2000);

        // Exibindo as informações de f1
        System.out.println("Informações do Funcionario 1:");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Matricula: " + f1.getMatricula());
        System.out.println("Idade: " + f1.getIdade());
        System.out.println("Chefe: " + (f1.getChefe() == null ? "Sem Chefe" : f1.getChefe().getNome()));
        System.out.println("Salário: " + f1.getSalario());

        // Exibindo as informações de f2
        System.out.println("\nInformações do Funcionario 2:");
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Cargo: " + f2.getCargo());
        System.out.println("Matricula: " + f2.getMatricula());
        System.out.println("Idade: " + f2.getIdade());
        System.out.println("Chefe: " + (f2.getChefe() == null ? "Sem Chefe" : f2.getChefe().getNome()));
        System.out.println("Salário: " + f2.getSalario());

        // Testando a função mesmaChefia
        System.out.println("\nOs dois funcionários têm o mesmo chefe? " + (f1.mesmaChefia(f2) ? "Sim" : "Não"));

        // Testando a igualdade entre f1 e f2
        System.out.println("f1 e f2 são iguais? " + (f1.equals(f2) ? "Sim" : "Não"));

        // Criando um novo funcionário com as mesmas características de f2
        Funcionario f3 = new Funcionario("Pedrinho", "Caixa", 2034, 25, f1, 2000);

        // Testando a igualdade entre f2 e f3
        System.out.println("f2 e f3 são iguais? " + (f2.equals(f3) ? "Sim" : "Não"));
    }
}
