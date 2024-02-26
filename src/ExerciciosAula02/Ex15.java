package ExerciciosAula02;

import java.util.Locale;

public class Ex15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*15. Duas barras de chocolate geralmente sao vendidas por 90 centavos. 
		 * Esta semana, há uma promoção de três barras por R$:1,05. 
		 * Quanto voce poderá economizar em uma única barra comprando a 
		 * promoção das três barras em vez de compras as duas?*/
						
		double umaBarraValor = 0.90 / 2;		
		double umaBarraPromo = 1.05 / 3;
		
		double economia = umaBarraValor - umaBarraPromo;
				
		System.out.println(umaBarraValor);	
		System.out.println(umaBarraPromo);
		System.out.printf("Economia de:%.2f%n", economia);

	}

}
