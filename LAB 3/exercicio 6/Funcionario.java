import java.util.Objects;

public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, int matricula, int idade, Funcionario chefe, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.idade = idade;
        this.chefe = chefe;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public Funcionario getChefe() {
        return this.chefe;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public boolean mesmaChefia(Funcionario f) {
        if (this.chefe == null || f.getChefe() == null) {
            return false; // Nenhum chefe para comparar
        }
        return this.chefe.equals(f.getChefe());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Mesmo objeto na memória
        }
        if (!(obj instanceof Funcionario)) {
            return false; // Não é da classe Funcionario
        }

        Funcionario f = (Funcionario) obj;

        // Compara apenas a chefia
        return Objects.equals(this.chefe, f.getChefe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(chefe);
    }
}
