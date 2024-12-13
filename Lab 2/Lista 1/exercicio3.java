import java.util.*;

public class exercicio3
{
    static class Volume{
        final double PI = 3.14159;
        double raio;

        public Volume(double raio) {
            this.raio = raio;
        }

        public double calcular() {
            double volume = (4.0/3.0) * PI * Math.pow(this.raio, 3);
            return volume;
        }
    }

    public static void main(String[] args) {
        Volume teste = new Volume(4.5);
        System.out.println("Volume: " + teste.calcular());
    }
}
