package ExerciciosAula01;

import java.util.Locale;

public class Ex14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// 14 – Resolva em um programa:
		// 10.5 + 2 x 3 / 45 -3.5
		
		double resultado = (10.5 + (2 * 3)) / (45.0 - 3.5);			
		System.out.printf("Resultado:%.3f%n", resultado);

	}

}
