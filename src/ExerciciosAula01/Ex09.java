package ExerciciosAula01;

import java.util.Locale;

public class Ex09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		// 9 – (Área e perímetro de um retângulo) Escreva um programa que exiba a área e 
		// o perímetro de um retângulo com largura de 4,5 e altura de 7,9 usando a seguinte fórmula: 
		// área = largura x altura
		// perimetro = 2 x (largura + altura)
		
		double largura = 4.5;
		double altura = 7.9;
		
		double area = largura * altura;
		double perimetro = 2 * (largura + altura);
		
		System.out.printf("Area:%.2f%n", area);
		System.out.printf("Perimetro:%.1f%n", perimetro);
		
		
	}

}
