package ocajp8.um.javabasico;


/**
 * Nesse Exemplo a resposta é 1 pois o atributo da classe int a = 1
 * recebe esse valor
 * 
 *  No laço for o valor de a é interno ao laço, como não tem {} vale apenas a primeira linha
 *  Depois imprime a em seguida diminui -1 de seu valor. 
 *  
 *  
 * @author carlos
 *
 */
public class Exercicio3 {
	
	static int a = 1;
	
	public static void main(String[] args) {
		
		for(int a = 0 ; a<5 ; a++) 
			a++;
		
		System.out.println(a--); //1 a pós fixado
	}
}




  