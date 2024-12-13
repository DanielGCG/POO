public class Driver {
	public static int lista[] = new int[3];
	public static void main(String[] args) {
		try {
			System.out.println("inicio da main");
			Exercicio.metodo1();
			System.out.println("fim da main");
		} catch(Exception e) {
			System.out.println("Excecção genérica capturada");
		}
	}
}
