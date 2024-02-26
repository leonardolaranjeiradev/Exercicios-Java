package ExerciciosAula02;

public class Ex18 {

	public static void main(String[] args) {
		/*18. Kendra vendeu 50 caixas de biscoito em 20 dias. 
		 * Sua irmã mais velha, Alicia, vendeu o dobro das caixas 
		 * na metade do tempo. Se as meninas continuassem com a meta 
		 * de vendas, quantas caixas elas poderiam ter vendido no total 
		 * se ambas tivessem trabalhado por 40 dias?*/
		
		// Kenda 50caixas 20 dias
		// Alicia 100caixas 10 dias
		// 40 dias?
		
		int kenda = (50 * 40) / 20;
		int alicia = (100 * 40) / 10;
		
		int total = kenda + alicia;
		
		System.out.println("No total elas poderiam ter vendido:" + total + " de caixas");

	}

}
