import java.util.*;

public class exercicio4
{
    static class Calculadora{
        static double valortotal = 0.0;
        double valoratual = 0.0;

        public void Calculadora (){
        }

        public void mais (double valoratual) {
            this.valortotal += valoratual;
        }

        public void menos (double valoratual) {
            this.valortotal -= valoratual;
        }

        public void multiplicacao (double valoratual) {
            this.valortotal = this.valortotal * valoratual;
        }

        public void divisao (double valoratual) {
            this.valortotal = this.valortotal / valoratual;
        }

        public void mostrar () {
            System.out.println ("Total: " + this.valortotal);
        }
    }

    public static void main (string[] args) {
        Scanner sc = new Scanner (System.in);
        char tecla = ' ';

        Calculadora cal1 = new Calculadora ();

        while (tecla != 's' || tecla != 'S'){
            if (tecla.equals('+')){
                cal1.mais (sc.nextDouble());
            }
            if (tecla.equals('-')){
                cal1.menos (sc.nextDouble());
            }
            if (tecla.equals('*')){
                cal1.multiplicacao (sc.nextDouble());
            }
            if (tecla.equals('/')){
                cal1.divisao (sc.nextDouble());
            }
            cal1.mostrar();
        }
    }

}