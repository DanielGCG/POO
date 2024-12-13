public class Funcionario {
    private  String nome;
    private  int matricula;
    private double salario;
    private Funcionario chefe;

    public Funcionario(String n, int m, double s, Funcionario c){
        nome = n;
        matricula = m;
        salario = s;
        chefe = c;
    }

    public double bonus(Trimestre t){
        return salario * 0.1;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return this.matricula;    
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public Funcionario getChefe(){
        return this.chefe;
    }

    public void setChefe(Funcionario chefe){
        this.chefe = chefe;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true; // Deve retornar true, pois é o mesmo objeto.
        }
        if (!(obj instanceof Funcionario)) {
            return false; // Se obj não for uma instância de Funcionario, retorna false.
        }
        Funcionario f = (Funcionario) obj; // Converte obj para Funcionario.
        return this.matricula == f.getMatricula(); // Usa == para comparar inteiros.
    }

}
