public class Carta implements Printavel {
    Numero numero;
    Naipe naipe;

    @Override
    public String imprimir(){
        return (numero + " de " + naipe);
    }
    
    public Carta (Naipe meuNaipe, Numero meuNumero){
        this.naipe = meuNaipe;        
        this.numero = meuNumero;    
    }

    public enum Naipe {
        OUROS,
        ESPADAS,
        PAUS,
        COPAS
    }
}
