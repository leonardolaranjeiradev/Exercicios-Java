package ExerciciosAula02;

public class Ex12 {

	public static void main(String[] args) {
		/*12. Uma maratona de bicicleta de três dias exige atletas 
		 * que percorram 100 milhas no primeiro dia e 20 milhas a menos 
		 * no segundo. Se o total da viagem for de 250 milhas, quantas milhas 
		 * os atletas percorreram no terceiro dia?*/
		
		// maratona 3 dias
		// 1 dia 100 milhas
		// 2 dia 20 a menos
		
		int totalMaratona = 250;
		int primeiroDia = 100;
		int segundoDia = primeiroDia - 20;
		int terceiroDia = totalMaratona - (primeiroDia + segundoDia);
		
		System.out.println("No terceiro dia:" + terceiroDia);
		

	}

}
