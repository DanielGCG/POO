import java.util.*;

public class atividade2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura);
	}
}
