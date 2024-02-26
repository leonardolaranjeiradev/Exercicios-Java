package ExerciciosAula02;

import java.util.Locale;

public class Ex21 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*21. Yianni acabou de comprar uma casa financiada 
		 * pelo preço de R$385.000,00. O valor mensal do financiamento 
		 * para cobrir o capital e os juros serão de R$: 1.800 
		 * por mês por 30 anos. Quando ele terminar de pagar tudo, 
		 * quanto Yianni pagará a mais em juros acima do valor da casa?*/
		
		// Yianni 385.000,00 
		// 1.800,00 / 30 anos 
		
		int meses = 30 * 12;
		double financiamento = meses * 1800.0;
		double juros = financiamento - 385000.0;
		
		System.out.println("Yianni irá pagar um total de R$" + juros + " juros na casa");
		
		
	}

}
