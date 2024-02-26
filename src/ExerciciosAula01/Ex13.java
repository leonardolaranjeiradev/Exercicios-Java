package ExerciciosAula01;

import java.util.Locale;

public class Ex13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*13 – (Álgebra: resolver equações lineares 2x2) Você pode usar a regra de Cramer para resolver 
		 * o seguinte sistema de equações lineares 2x2:
		 * 
		 * 	ax + by = e                             
                                  x = ed – bf / ad – bc    y = af – ec / ad - bc
			cx + dy = f
			
			Escreva um programa que resolva a seguinte equação e exiba o valor de x e y:
			3.4x + 50.2y = 44.5
			2.1x + .55y = 5.9
		 * */		
		
		double a = 3.4;
		double b = 50.2;
		double e = 44.5;		
		double c = 2.1;
		double d = .55;
		double f = 5.9;
		
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));  
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		System.out.printf("X = %.3f%n", x);
		System.out.printf("Y = %.3f%n", y);
		
		
	}

}
