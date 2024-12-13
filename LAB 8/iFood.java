import java.util.*;
public class iFood implements Emissor {
    private ArrayList<Conveniado> parceiros = new ArrayList<>();

    public iFood() {
        parceiros.add(new Restaurante("123456/0001", "Ronald's Pizza"));
        parceiros.add(new Restaurante("123456/0001", "Cantina Roninho da Massa"));
        parceiros.add(new Restaurante("123456/0001", "Lonaldo Comida Japonesa"));
    }

    public Conveniado getParceiro(String nome) {
        for (Conveniado c : parceiros) {
            if (nome.equals(c.getNome())) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void notify(LazyObserver cliente) {
        cliente.update(true); // Notifica o cliente, concedendo desconto
    }

    public double desconto(Cliente c) {
        // Implementar cálculo de desconto
        return 0;
    }
}
