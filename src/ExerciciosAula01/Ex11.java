package ExerciciosAula01;

import java.util.Locale;

public class Ex11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//11 – (Projeção populacional) O U.S. Census Bureau projeta a população com base nas seguintes suposições: 
			/*	- Um nascimento a cada 7 segundos
			- Uma morte a cada 13 segundos 
			- Um novo imigrante a cada 45 segundos
			
			Escreva um programa para exibir a população para cada um dos próximos cinco anos. 
			Suponha que a população atual seja 312.032.486 e que um ano tenha 365 dias. 
			Dica: Em Java, se dois inteiros realizam Divisão, o resultado é um inteiro. 
			A parte fracionária está truncada. Por exemplo, 5/4 é 1 (não 1,25) e 10/4 é 2 (não 2,5). 
			Para obter um resultado preciso com a parte fracionária, um dos valores envolvidos na Divisão 
			deve ser um número com vírgula decimal. Por exemplo, 5,0/4 é 1,25 e 10/4,0 é 2,5.*/
		
		double segundosAno = 365.0 * 24.0 * 60.0 * 60.0;
		double nascimentosPorAno = segundosAno / 7.0;
		double mortesPorAno = segundosAno / 13.0;
		double imigrantesPorAno = segundosAno / 45.0;

		double variacaoPopulacionalPorAno = nascimentosPorAno - mortesPorAno + imigrantesPorAno;
		double populacaoAtual = 312032486;

		double populacaoAposUmAno = populacaoAtual + variacaoPopulacionalPorAno;
		double populacaoAposDoisAnos = populacaoAposUmAno + variacaoPopulacionalPorAno;
		double populacaoAposTresAnos = populacaoAposDoisAnos + variacaoPopulacionalPorAno;
		double populacaoAposQuatroAnos = populacaoAposTresAnos + variacaoPopulacionalPorAno;
		double populacaoAposCincoAnos = populacaoAposQuatroAnos + variacaoPopulacionalPorAno;

		System.out.println("Em cinco anos a população será: " + populacaoAposCincoAnos);

	
		

	}

}
