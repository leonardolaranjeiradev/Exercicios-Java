package ExerciciosAula02;

public class Ex27 {

	public static void main(String[] args) {
		/*27 - Os seis filhos de Janey estão colorindo ovos 
		 * para a Páscoa. Ela comprou um total de 5 dúzias de 
		 * ovos para todas as crianças colorirem. Supondo que 
		 * cada criança receba a mesma quantidade de ovos, quantos 
		 * ovos cada criança recebeu?*/		
		
		int filhosJaney = 6;
		int ovosComprados = 5 * 12;
		int ovosParaCada = ovosComprados / filhosJaney;
		
		System.out.println("Cada criança irá receber " + ovosParaCada + " ovos");
		
	}
	

}
