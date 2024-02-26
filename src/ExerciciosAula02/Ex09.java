package ExerciciosAula02;

public class Ex09 {

	public static void main(String[] args) {
		/*9. Jéssica deseja comprar 40 canetas. Um pacote com 8 canetas 
		 * custa R$ 7, porém um pacote com 10 custa R$: 8. Quanto ela economizará 
		 * comprando os pacotes com 10 canetas em vez dos pacotes com 8?*/	
				
		int totalCanetas = 40;		
		int pct8 = (totalCanetas / 8)  * 7;
		int pct10 = (totalCanetas / 10) * 8;		
		int economia = pct8 - pct10;		
		
		System.out.println("Jessica economizará R$" + economia + ",00");
		
		

	}

}
