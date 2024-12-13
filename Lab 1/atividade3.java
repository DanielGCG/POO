import java.util.*;

public class atividade3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7){
		    System.out.println("Aprovado!");
		}
		
		if (3 <= media && media < 7){
		    System.out.println("Prova Final!");
		}
		if (media < 3){
		    System.out.println("Reprovado!");
		}
	}
}
