import java.util.*;

public class atividade4
{
    public static int fatorialrecursivo (int N)
    {
        if (N == 0){
            return 1;
        }
        if (N == 1){
            return N;
        }
        else
        {
            return N*fatorialrecursivo (N-1); 
        }
    }
    
	public static void main(String[] args)
	{
		System.out.println("Qual fatorial que deseja calcular (entre 0 e 20)?");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N < 0 || N > 20)
		{
		    System.out.println("Valor inválido!");
		}
		
		else
		{
		    int resultado = fatorialrecursivo(N);
		    System.out.println("Resultado: " + resultado);
		}
	}
}
