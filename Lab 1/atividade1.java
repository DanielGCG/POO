import java.util.*;

public class atividade1
{
	public static void main(String[] args) {
	    //Declaração do pi
	    final double pi = 3.14159;
	    Scanner sc = new Scanner(System.in);
	    
		double R = sc.nextDouble();
		double r = sc.nextDouble();
		
		//Calculo da area
		double amaior = (pi * (R*R - r*r));
		System.out.println(amaior);
	}
}
