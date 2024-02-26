package ExerciciosAula02;

public class Ex08 {

	public static void main(String[] args) {
		/*8. Uma empresa investe R$: 7.000.000 no desenvolvimento de um produto. 
		 * Assim que este produto chegar às lojas cada venda retornará 
		 * R$: 35 do investimento. Se o produto for vendido a uma taxa constante 
		 * de 25.000 por mês, quanto tempo levará para a empresa recuperar o investimento inicial?*/
		
		double investimento = 7000000.0;
		double retornoPorVenda = 35.0;
		int vendasMes = 25000;
		
		double totalVendas = investimento / retornoPorVenda;		
		double tempoMes = totalVendas / vendasMes;
		
		System.out.println("A empresa levará " + tempoMes + " meses para recuperar o ivestimento");
	}

}
