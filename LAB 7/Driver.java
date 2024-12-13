public class Driver {
    public static void main(String[] args) {
        Casa c = new Casa("Rua do Ronald, 41");
        Celular cel1 = new Celular(c); //Celular está atrelado a uma casa
        Celular cel2 = new Celular(c); //Celular está atrelado a uma casa
        CentralPolicia centralPol = new CentralPolicia();
        CentralVigilancia central = new CentralVigilancia(c);
        
        central.addObserver(cel1);
        central.addObserver(cel2);
        central.addObserver(centralPol);
        cel1.setStatusDono(false); //O dono não tá em casa
        cel2.setStatusDono(false); //O dono não tá em casa
        central.vigiar();
        
        System.out.println ("Dono em casa? " + cel1.getStatusDono());
        System.out.println ("Dono em casa? " + cel2.getStatusDono());
    }
}
