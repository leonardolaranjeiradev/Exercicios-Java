package ExerciciosAula02;

public class Ex14 {

	public static void main(String[] args) {
		/*14. Kenny fez 25 flexões. Seu irmão mais velho, 
		 * Sal, fez o dobro da quantidade de flexões de Kenny. 
		 * E a irmã mais velha deles. Natalie, fez 10 a mais que Sal. 
		 * Quantas flexões os três fizeram ao todo?*/		
		
		int kenny = 25;
		int sal = 25 * 2;
		int natalie = sal + 10;
		int total = kenny + sal + natalie;
		
		System.out.println("Fizeram um total de:" + total);

	}

}
