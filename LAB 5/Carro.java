public class Carro extends VeiculoTerrestre{
    private class Motor{
        Tipo modelo;
        public void liga(){
            System.out.println("Motor " + modelo + " ligado");
        }

        public Motor (Tipo modelo){
            this.modelo = modelo;
        }
    }

    private Motor meuMotor;
    //String modelo;

    public Carro(String modelo, Tipo t){
        this.modelo = modelo;
        meuMotor = new Motor(t);
    }
    
    @Override
    public void liga(){
    meuMotor.liga();
    System.out.println(modelo + " ligado! (Carro)");
    }
}