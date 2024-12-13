public class lab4ex6{
    public static void main(String[] args) {
        Gerente jose = new Gerente("José", 2222, 10500.00, null);
        Funcionario eugenio = new Funcionario("Eugênio", 9999, 4500.00, jose);

        Trimestre t = Trimestre._4o;

        System.out.println("\nBônus de " + jose.getNome() + " no " + t + "trimestre:");
        System.out.println(jose.bonus(t));
        System.out.println("\nBônus de " + eugenio.getNome() + " no " + t + " trimestre:");
        System.out.println(eugenio.bonus(t));
        System.out.println("jose tem matricula igual a eugenio é? " + jose.equals(eugenio));
    }
}
