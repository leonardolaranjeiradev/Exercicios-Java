package ExerciciosAula01;

import java.util.Locale;

public class Ex12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
   /*12 – (Velocidade média em quilômetros) suponha que um corredor corra 24 milhas em 1 hora, 
   * 40 minutos e 35 segundos. Escreva um programa que exiba a velocidade média em quilômetros por hora. 
	* (Observe que 1 milha equivale a 1,6 quilômetros.)*/
		
		
		
		double horas = (40.0 / 60) + (35.0 / 3600) + 1;
		double km = 24.0 * 1.6;
		double velocidadeMedia = km / horas;
		
		System.out.printf("Velocidade média:%.3f km/h%n", velocidadeMedia);


		
		
	}

}
