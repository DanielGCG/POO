import java.util.ArrayList;
public class LAB5 {
    public static void main(String[] args) {
        Carro c1 = new Carro("VW", Tipo.GASOLINA);
        Carro c2 = new Carro("GM", Tipo.ETANOL);
        Carro c3 = new Carro("Honda", Tipo.DIESEL);
        ArrayList<Carro> lc = new ArrayList<Carro>();
        lc.add(c1);
        lc.add(c2);
        lc.add(c3);
        lc.get(0).liga();
        //lc = null;
        c1.liga();
        c2.liga();
        c3.liga();
        
        Onibus o1 = new Onibus("MeuOnibus");
        o1.liga();
        o1.desliga();
    }
}