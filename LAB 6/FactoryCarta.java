import java.util.*
public class FactoryCarta {
    public static Carta cartaAleatoria(){

        int num = rand.nextInt(12); //Vai até 13
        int naipe = rand.nextInt(3) //Vai até 4

        Carta.numero meuNumero = Carta.numero.values()[num];
        Carta.naipe meuNaipe = Carta.naipe.values()[naipe];
        
        Carta c = new Carta(meuNaipe, meuNumero);
        return c;
    }
}
