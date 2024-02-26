package ExerciciosAula02;

public class Ex23 {

	public static void main(String[] args) {
		/*23. Arlo participou de um jogo noturno de pôquer 
		 * organizado pelos seus amigos. Ás 23 horas, ele já 
		 * havia perdido R$ 65 desde o ínicio. Entre 23 horas e 2 horas, 
		 * ele ganhou R$: 120. Então, nas próximas três horas, ele perdeu 
		 * mais R$: 45. Nas quatro horas finais do jogo, ele ganhou R$30. 
		 * Quanto Arlo ganhou ou perdeu durante o jogo?*/				
		
		int saldoInicial = -65;	
		int entre23e2 = 120;
		int proximas3H = -(3 * 45);
		int proximas4H = 30 * 4;
		
		int saldoFinal = saldoInicial + entre23e2 + proximas3H + proximas4H; 
		System.out.println("Arlo saiu com um saldo de: R$" + saldoFinal + ",00");
		
		
		
		

	}

}
