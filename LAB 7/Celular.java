public class Celular implements Observer{
    private Casa c;
    String nome;

    public Celular (Casa c) {
        this.c = c;
    }

    @Override
    public void update (boolean algoSuspeito){
        System.out.println ("ALERTA SUS -> " + algoSuspeito);
    }

    public boolean getStatusDono () {
        return c.getDonoEmCasa ();
    }
    
    public void setStatusDono (boolean status) {
        c.setDonoEmCasa (status);
    }
}
