import java.util.Random;
public class Camera {
    
    //Função de gerar movimento (simular movimento na casa)
	public boolean haMovimento() {
		Random rand = new Random();
		return rand.nextInt(100) % 4 == 0;
	}
}
