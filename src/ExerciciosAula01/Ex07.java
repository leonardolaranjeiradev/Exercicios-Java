package ExerciciosAula01;

import java.util.Locale;

public class Ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//7 – (Pi aproximado) Pi pode ser calculado usando a seguinte fórmula:
		// pi = 4 * (1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 + ...)
		// Escreva um programa que exiba o resultado de 4 * (1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11)
		// e 4 * (1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 + 1/13) Use 1.0 em vez de 1 no seu programa.
		
		double resultado1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		double resultado2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);				
		
		System.out.printf("1º Resultado:%.4f%n", resultado1);
		System.out.printf("2º Resultado:%.4f%n", resultado2);		
		
     
	}

}
