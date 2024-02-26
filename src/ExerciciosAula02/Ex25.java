package ExerciciosAula02;

import java.util.Locale;

public class Ex25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*25. Angela e Gustavo trabalham em uma lanchonete 
		 * fazendo sanduiches. Em alta velocidade, Angela consegue 
		 * fazer quatro sanduiches em três minutos e Gustavo três 
		 * sanduiches em quatro minutos. Trabalhando juntos, quanto 
		 * tempo eles levarão para fazer 200 sanduiches?*/
		
		
		// Angela 4 Sandu  00:03min
		// Gustavo 3 Sandu 00:04 min
		//  200 Sanduiches
		
		double angela = 4 / 3.0;
		double gustavo = 3 / 4.0;
		
		double resultado = 200 / (angela + gustavo);
		

		
		System.out.println("Juntos eles levarão um total de " + resultado + " minutos para fazer 200 sanduiches");
		
	
		
	}

}
