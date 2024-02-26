package ExerciciosAula01;

import java.util.Locale;

public class Ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//8 – (Área e perímetro de um círculo) Escreva um programa que exiba a área e o perímetro de um círculo com raio 5,5 usando a seguinte fórmula: 
		// perímetro = 2 x raio x pi 
		// área = raio x raio x pi
		
		double raio = 5.5;
		double perimetro = 2 * raio * Math.PI; 
		double area = raio * raio * Math.PI;
		
		System.out.printf("Perimetro:%.4f%n", perimetro);
		System.out.printf("Area:%.4f%n", area);
		
		

	}

}
