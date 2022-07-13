package cinematica;

import java.util.Scanner;

public class Mru {

	/* Movimento Retil�neo Uniforme (M.R.U) 
	No M.R.U. o movimento n�o sofre varia��es, nem de dire��o, nem de velocidade. 
	Portanto, podemos relacionar as nossas grandezas da seguinte forma:	DS= V.Dt */
	
	public static void main(String[] args) {
		double V=0;
		double Dt=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserir o valor da Velocidade:");
		V = entrada.nextDouble();	
		System.out.println("Inserir o valor do Tempo:");
		Dt = entrada.nextDouble();	
		
		int DS =(int) Math.round(V*Dt);
		
		
		System.out.println("O o Valor de Delta: "+ DS);

	}

}
