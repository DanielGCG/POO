import java.util.*;

public class atividade5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		for (int i = 0 ; i < 5 ; i++){
		    vetor[i] = sc.nextInt();
		}
		
		int maior = 0;
		
		for (int i = 0 ; i < 5 ; i++){
		    if(i == 0) maior = vetor[i];
		    else if(vetor[i] > maior) maior = vetor[i];
		}
		System.out.println("Maior: " + maior);
		
		sc.close();
	}
}
