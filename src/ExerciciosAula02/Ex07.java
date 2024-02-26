package ExerciciosAula02;

import java.util.Locale;

public class Ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*7. Um caderno grande custa R$: 1,50 a mais que um pequeno. 
		 * Karan comprou dois grandes e quatro pequenos, enquanto Almonte 
		 * comprou cinco grandes e um pequeno. Quanto Almonte gastou a mais que Karan?*/
		
		double cadernoPequeno = 0.0;
		double cadernoGrande = cadernoPequeno + 1.50;
		
		double karan = (2.0 * cadernoGrande) + (4.0 * cadernoPequeno);
		double almonte = (5.0 * cadernoGrande) + cadernoPequeno;
		
		double dif = almonte - karan;
		
		System.out.println("Essa foi a diferença entre os dois:" + dif);
		
		
		
		
		
		

	}

}
