public class Gerente extends Funcionario{
    public Gerente(String nome, int mat, double sal, Funcionario chefe){
        super(nome, mat, sal, chefe);
    }

    @Override
    public double bonus(Trimestre t){
        return (t == Trimestre._4o) ? getSalario() * 0.15 : bonus();
    }

    public double bonus(){
        return getSalario() * 0.2;
    }
}
