import java.util.ArrayList;
import java.util.List;

public class CentralVigilancia{
    private List<Observer> observers = new ArrayList<>();
	private Casa c;

    public void addObserver (Observer observer) {
        observers.add(observer);
    }

    public void removeObserver (Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers (boolean status) {
        for (Observer observer : observers){
            observer.update(status);
        }
    }

    //Método construtor
	public CentralVigilancia(Casa c) {
		this.c = c;
	}

    //Função de vigiar
	public boolean vigiar() {
		boolean algoSuspeito = false;
		for (int i = 0; i < 10; i++) {
			if(c.movimentacao() && c.getDonoEmCasa() == false) { //O dono não está em casa e algo se mexeu
                    algoSuspeito = true;
                    notifyObservers(algoSuspeito);
                    // Retorna ao status padrão
				    algoSuspeito = false;
                }
            else notifyObservers(algoSuspeito); //System.out.println("Nada SUS (sistema unico de saude).");
		}
		return algoSuspeito;
	}
}
