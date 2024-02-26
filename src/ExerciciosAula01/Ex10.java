package ExerciciosAula01;

import java.util.Locale;

public class Ex10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//10 – (Velocidade média em milhas) Suponha que um corredor corra 14 quilômetros em 45 minutos
		//e 30 segundos. Escreva um programa que exiba a velocidade média em quilômetros por hora. 
		//(Observe que 1 milha equivale a 1,6 quilômetros.)
		
		double milhas = 14 / 1.6;
		double horas = (45 / 60.0) + (30.0 / 3600);		
		double veloMedia = milhas / horas;
		
		System.out.println("Velocidade média em milhas:" + veloMedia);
		
	}

}
