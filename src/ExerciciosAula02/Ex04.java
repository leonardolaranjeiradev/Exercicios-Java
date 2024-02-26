package ExerciciosAula02;

public class Ex04 {

	public static void main(String[] args) {
		/*4. Um restaurante possui 5 mesas que comportam 8 pessoas cada, 
		 *16 mesas comportam 6 cada e 11 que comportam 4 cada. 
		 *Qual é a capacidade total de todas as mesas do restaurante?*/
		
		int mesa1 = 5 * 8;
		int mesa2 = 16 * 6;
		int mesa3 = 11 * 4;
		
		int capacidadeTotal = mesa1 + mesa2 + mesa3;
		
		System.out.println("Capacidade total:" + capacidadeTotal);
		

	}

}
