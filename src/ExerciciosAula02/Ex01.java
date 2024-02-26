package ExerciciosAula02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*1. A trilogia de um filme de terror inclui os filmes "Zumbis Duram para Sempre", que dura 80 minutos, 
		"Um lobisomem Americano em Bermudas", que possui 95 minutos e "O Lanchinho da Noite do Vampiro",
		com 115 minutos do inicio ao fim. Qual é a relação total do três filmes ?
		 */
		
		int zumbis = 80;
		int lobisomem = 95;
		int vampiro = 115;
		
		int minutos = zumbis + lobisomem + vampiro;
		int totalHoras = minutos / 60;
		int totalMinutos = minutos % 60;
		
		System.out.println(minutos);
		System.out.println("Os três filmes possuem um total de " + totalHoras + ":" + totalMinutos + "Hrs");
		
		
		
		
		sc.close();

	}

}
