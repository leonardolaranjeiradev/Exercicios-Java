package ExerciciosAula02;

public class Ex24 {

	public static void main(String[] args) {
		/*24. Clarissa comprou um diamante por R$: 1.000 
		 * e o vendeu para André por R$:1.100. Um mês depois, 
		 * André precisou de dinheiro, então, vendeu o diamante 
		 * para Clarissa por R$: 900. No entanto, alguns meses depois, 
		 * ele recebeu uma herança inesperada e comprou o diamante de novo 
		 * por R$:1.200. Qual foi o lucro total de Clarissa nessas negociações?*/
		
		// Comprou Diamante 1.000,00
		// Vendeu para André 1.100,00
		// André vendeu por 900,00
		// Comprou de novo 1.200,00
		
		int clarissa = -1000;
		int venda1 = 1100;
		
		clarissa += venda1;		
		int compra1 = -900;	
		
		clarissa += compra1;
		int venda2 = 1200;
		
		clarissa += venda2;		
		
		System.out.println("Clarissa teve um lucro total de R$" + clarissa + ",00");
		
		
		
		
		
		
		
	}

}
