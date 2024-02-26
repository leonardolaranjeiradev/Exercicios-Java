package ExerciciosAula02;

import java.util.Locale;

public class Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*3. Arturo trabalhou 40 horas por semana recebendo R$12,00 por hora. 
		 * Ele então, recebeu um aumento de R$1,00 por hora e trabalhou 30 horas semanais. 
		 * Qual foi a quantia a mais de dinheiro que ele recebeu referente a primeira semana 
		 * de trabalho em relação a segunda?*/
		
		double semana1 = 40 * 12.0;
		double semana2 = 30 * 13.0;		
		double diferenca = semana1 - semana2;
		
		System.out.println("Primeira semana:" + semana1);
		System.out.println("Segunda semana:" + semana2);
		System.out.println("Diferença das semanas:" + diferenca);
		

	}

}
