import java.util.*;

public class lab2 {
    static class Funcionario {
        // Atributos
        private String nome;
        private double salarioHora;
        private double horasTrabalhadasMes;
        private int idFunc; // ID do funcionário
        // De classe
        private static int proxID = 0; // Inicializa o ID
        private static final double SALARIO_HORA_MINIMO = 12.50;

        // Construtor
        public Funcionario(String nome) {
            this.nome = nome;
            proxID++;
            this.idFunc = proxID;
        }

        public Funcionario(String nome, double salarioHora) {
            this(nome); // Chama o construtor anterior para definir o nome e o ID            
            if (salarioHora >= SALARIO_HORA_MINIMO){ 
                this.salarioHora = salarioHora;
            }
            else {
                System.out.println ("Salário Hora menor que o mínimo!");
                System.exit(0);
            }
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public int getId() {
            return idFunc;
        }

        public double getSalarioHora() {
            return salarioHora;
        }

        public double calculaSalarioMes () {
            return salarioHora * horasTrabalhadasMes;
        }

        public void reiniciaMesTrabalho () {
            this.horasTrabalhadasMes = 0;
        }

        public void atualizaNome(String novonome) {
            if (novonome.contains(" ")) {
                this.nome = novonome;
            } else {
                System.out.println("É necessário ter pelo menos um sobrenome!");
            }
        }

        public void atualizaSalarioHora (double novosalario) {
            if (novosalario >= this.salarioHora) {
                this.salarioHora = novosalario;
            }
            else {
                System.out.println("Novo valor de hora trabalhada tem que ser maior que o valor atual!");
            }
        }

        public static int getProximoID () {
            return proxID;
        }

        public void adicionaDiaDeTrabalho (double hora) {
            if (hora >= 4 && hora <= 24) {
                this.horasTrabalhadasMes = this.horasTrabalhadasMes + hora;
            }
            else {
                System.out.println("Horas trabalhadas menor que 4 horas ou maior que 24 horas!");
            }
        }
    }
    
    public static void main(String[] args) {
        // Testadora
        System.out.println("== Testadora ==");

        // Criando um funcionário com nome e salário
        Funcionario f1 = new Funcionario("João Silva", 15.00);

        // Testando getters
        System.out.println("Nome: " + f1.getNome());
        System.out.println("ID: " + f1.getId());
        System.out.println("Salário por Hora: " + f1.getSalarioHora());

        // Testando a adição de horas de trabalho
        f1.adicionaDiaDeTrabalho(8);
        f1.adicionaDiaDeTrabalho(6);
        System.out.println("Salário no mês (após 14h trabalhadas): " + f1.calculaSalarioMes());

        // Reiniciar o mês de trabalho
        f1.reiniciaMesTrabalho();
        System.out.println("Salário no mês (após reiniciar): " + f1.calculaSalarioMes());

        // Testando atualização do nome
        f1.atualizaNome("João Carlos Silva");
        System.out.println("Nome atualizado: " + f1.getNome());

        // Testando atualização do salário
        f1.atualizaSalarioHora(20.00);
        System.out.println("Salário por Hora atualizado: " + f1.getSalarioHora());

        // Testando caso de erro ao adicionar horas inválidas
        f1.adicionaDiaDeTrabalho(3);  // Deve mostrar mensagem de erro

        // Testando caso de erro ao tentar definir um salário menor
        f1.atualizaSalarioHora(10.00);  // Deve mostrar mensagem de erro

        // Verificando o próximo ID disponível
        System.out.println("Próximo ID: " + Funcionario.getProximoID());

        // Criando outro funcionário para testar o incremento do ID
        Funcionario f2 = new Funcionario("Maria Souza", 18.00);
        System.out.println("Nome: " + f2.getNome());
        System.out.println("ID: " + f2.getId());

        System.out.println("Salário por Hora: " + f2.getSalarioHora());
    }
}
