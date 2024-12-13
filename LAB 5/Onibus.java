public class Onibus extends VeiculoTerrestre{
    private class Motor{
        String modelo;
        public void liga(){}
    }

    private Motor meuMotor;
    //String modelo;

    public Onibus(String modelo){
        this.modelo = modelo;
        meuMotor = new Motor();
    }
    
    @Override
    public void liga(){
        meuMotor.liga();
        System.out.println(modelo + " ligado! (Onibus)");
    }

    @Override
    public void desliga(){
        System.out.println(modelo + " desligado! (Onibus)");
    }
}