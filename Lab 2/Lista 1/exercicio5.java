import java.util.*;

public class exercicio5
{
    static class Combustivel{
        double horas;
        double velocidade;
        final double EFICIENCIA = 12;

        public Combustivel(double horas, double velocidade){
            this.horas = horas;
            this.velocidade = velocidade;
        }

        public double litros(){
            return (this.horas * this.velocidade) / EFICIENCIA; 
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Horas: ");
        double horas = sc.nextDouble();
        System.out.println("Velocidade: ");
        double velocidade = sc.nextDouble();

        Combustivel carro = new Combustivel(horas, velocidade);

        System.out.println("Total de litros: " + carro.litros());

        sc.close();
    }
}
