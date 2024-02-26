package ExerciciosAula01;

import java.util.Locale;

public class Ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//5 – (Calcular expressões) Escreva um programa que exiba o resultado de:
		// 9.5 * 4.5 – 2.5 * 3 / 45.5 – 3.5
		
		double calculo = ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5);
		
		System.out.printf("%.4f%n", calculo);		
        
		
	}

}
