package ExerciciosAula02;

public class Ex16 {

	public static void main(String[] args) {
		/*16. Simon observou dois números quadrados que somam 130. 
		 * Ele então, percebeu que, ao subtrair um destes números 
		 * quadrados por outro, o resultado é 32. Qual é o menor número 
		 * desses dois números quadrados?*/
		
		 
        int somaQuadrados = 130;
        int diferencaQuadrados = 32;
        
        int xQuadrado = (somaQuadrados + diferencaQuadrados) / 2;       
        int yQuadrado = somaQuadrados - xQuadrado;
             
        System.out.println("O menor número entre os quadrados é: " + Math.min(xQuadrado, yQuadrado));
		
		
		

	}

}
