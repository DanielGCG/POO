import java.util.*;
public class Lab6{
    public static void main(String[] args){
        ArrayList<Carta> mao = new ArrayList<Carta>();
        // Cria 5 cartas aleatórias
        for (int quant = 0; quant < 5 ; quant++){
            mao.add(cartaAleatoria());
        }
        // Imprime as 5 cartas
        for (int quant = 0; quant < 5 ; quant++){
            mao.get(quant).imprimir();
        }
    }
}
