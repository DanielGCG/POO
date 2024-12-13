public class CentralPolicia implements Observer{
    
    public CentralPolicia (){    
    }

    @Override
    public void update (boolean algoSuspeito){
        System.out.println ("POLÍCIA: alerta recebido!");
    }
}
