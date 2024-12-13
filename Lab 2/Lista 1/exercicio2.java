import java.util.*;

public class exercicio2
{
	static class Contagem{
	    int frango = 0;
	    int bife = 0;
	    int massa = 0;
	    int TFRANGO;
	    int TBIFE;
	    int TMASSA;
	    
	    public Contagem(int TFRANGO, int TBIFE, int TMASSA){
	        this.TFRANGO = TFRANGO;
	        this.TBIFE = TBIFE;
	        this.TMASSA = TMASSA;
	    }
	    
	    public void addFrango(int quantidade){
	       this.frango += quantidade;
	    }
	    
	    public void addBife(int quantidade){
	       this.bife += quantidade;
	    }
	    
	    public void addMassa(int quantidade){
	       this.massa += quantidade;
	    }
	    
	    public void delFrango(int quantidade){
	        if ((this.frango - quantidade) < 0){
	            System.out.println("Quantidade não permitida!");
	        } else {
	            this.frango -= quantidade;
	        }
	    }
	    
	    public void delBife(int quantidade){
	        if ((this.bife - quantidade) < 0){
	            System.out.println("Quantidade não permitida!");
	        } else {
	            this.bife -= quantidade;
	        }
	    }
	    
	    public void delMassa(int quantidade){
	        if ((this.massa - quantidade) < 0){
	            System.out.println("Quantidade não permitida!");
	        } else {
	            this.massa -= quantidade;
	        }
	    }
	    
	    public void faltou(){
	        int rfrango = TFRANGO - frango;
	        int rbife = TBIFE - bife;
	        int rmassa = TMASSA - massa;
	        int totalpessoas = 0;
	        
	        if (rfrango < 0){
	            System.out.println("Faltou " + (-rfrango) + " frangos!");
	            totalpessoas -= rfrango;
	        }
	        
	        if (rbife < 0){
	            System.out.println("Faltou " + (-rbife) + " bifes!");
	            totalpessoas -= rbife;
	        }
	        
	        if (rmassa < 0){
	            System.out.println("Faltou " + (-rmassa) + " massas!");
	            totalpessoas -= rmassa;
	        }
	        System.out.println ("Total de pessoas afetadas: " + totalpessoas);
	    }
	}
	
	public static void main(String[] args){
	    Contagem voo1 = new Contagem(80, 20, 40);
	    voo1.addFrango(45);
	    voo1.addBife(23);
	    voo1.addMassa(48);
	    voo1.faltou();
	}
}
