import java.util.*;
public class Cliente implements LazyObserver {
    public int engajamento = 10;
    public String nome;
    public double desconto = 0;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public void update(boolean queroDesconto) {
        if (queroDesconto) {
            setDesconto(); // Atribui desconto
        }
    }

    @Override
    public void solicitarUpdate(Emissor emissor) {
        emissor.notify(this);
    }

    public double fazerPedido(Conveniado deOnde, boolean queroDesconto) {
        double total = 0;
        Random rand = new Random();
        int numItens = rand.nextInt(10);
    
        while (numItens == 0) {
            numItens = rand.nextInt(10);
        }
    
        ArrayList<Desejo> minhaLista = new ArrayList<>();
        for (int i = 0; i < numItens; i++) {
            minhaLista.add(new Desejo());
            total += minhaLista.get(i).preco;
        }
    
        if (queroDesconto) {
            solicitarUpdate(deOnde); // Agora `deOnde` pode ser um Emissor
            engajamento += 10;
            System.out.println("Pedido feito com desconto - total: " + (total - desconto));
            return total - desconto;
        } else {
            System.out.println("Pedido feito sem desconto - total: " + total);
            engajamento += 10;
            return total;
        }
    }
    

    public int meuEngajamento() {
        return engajamento;
    }

    public double meuDesconto() {
        return desconto;
    }

    private void setDesconto() {
        // Implementar lógica de cálculo de desconto
        this.desconto = 10; // Exemplo: desconto fixo de 10 unidades
    }
}
