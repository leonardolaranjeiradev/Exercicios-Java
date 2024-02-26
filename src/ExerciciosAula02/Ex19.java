package ExerciciosAula02;

public class Ex19 {

	public static void main(String[] args) {
		/*19. Um grupo de 70 alunos do terceiro ano possui 
		 * exatamente a proporção de três meninas para cada 
		 * quatro meninos. Quando a professora pede para os 
		 * alunos se dividirem em pares para um exercício, seis 
		 * casais compostos por um menino e uma menina são formados 
		 * e o restante das crianças será dividido em pares com crianças 
		 * do mesmo sexo. Quantos pares de meninos a mais existem em relação 
		 * aos pares de meninas */
		
	
		
		int totalAlunos = 70;        
        int meninos = totalAlunos * 4 / (3 + 4);
        int meninas = totalAlunos - meninos;
      
        int paresMeninos = meninos / 2;
        int paresMeninas = meninas / 2;
        
        int diferenca = paresMeninos - paresMeninas;
     
        System.out.println("Pares de meninos: " + paresMeninos);
        System.out.println("Pares de meninas: " + paresMeninas);
        System.out.println("Diferença: " + diferenca);
       
		

	}

}
