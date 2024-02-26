package ExerciciosAula02;

import java.util.Locale;

public class Ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*6. Antonia comprou um suéter que normalmente custa 
		 * R$86,00 incluindo as taxas. Quando ela foi até o caixa, 
		 * descobriu que o suéter estava sendo vendido pela metade do preço. 
		 * Além disso, ela usou um cartão presente de R$20,00 para ajudar no pagamento. 
		 * Quanto ela gastou para comprar o suéter?*/
		
		// sueter 86
		// 50%
		// -20,00
		
		double sueter = 86.00;
		double desconto = sueter / 2.0;
		double cartaoPresente = -20.00;		
		double sueterFinal = desconto + cartaoPresente;
		
		System.out.println("O sueter ficou no valor de:" + sueterFinal);
		
	}

}
