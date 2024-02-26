package ExerciciosAula02;

public class Ex26 {

	public static void main(String[] args) {
		/*26. Todas as 16 crianças da escola primária da 
		 * Sra. Morrow possuem dois ou três irmãos. De modo geral, 
		 * as crianças possuem um total de 41 irmãos. Quantas das 
		 * crianças possuem três irmãos?*/
		
		// 16 possuem 2 ou 3 irmãos
		// total 41 irmãos
		
		int totalCriancas = 16;
		int totalIrmaos = 41;
		
		int trêsIrmãos = (totalIrmaos - 2 * totalCriancas) / (3 - 2);
		
		 System.out.println("O número de crianças que têm três irmãos é: " + trêsIrmãos);
	}

}
