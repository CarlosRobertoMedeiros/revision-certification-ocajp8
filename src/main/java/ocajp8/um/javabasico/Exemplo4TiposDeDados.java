package ocajp8.um.javabasico;


/**
 * Underscore_
 * 	Só pode ser usado em números
 *  Deve aparecer sempre entre números(nunca entre ponto ou qualquer coisa)
 *  
 *  
 *  Wrapper Classes
 *   
 *            char,      byte, short, long, boolean, int, float, Double
 *  Wrapper:  Character, Byte, Short, Long, Boolean, Integer, Float, Double   
 * 
 * Autoboxing
 * 		Integer a = 1;
 * 		int b = a;
 * 
 * Unboxing
 * 	    int a = 1;
 *      Integer b =a;
 *      
 * Inicialização de Variáveis
 *      Primitivos numericos a nivel de classe são iniciados com 0 por padrão
 *      Objetos Wrapper nunca são iniciados
 *      Dentro de métodos as variáveis declaradas não possuem valor padrão para inicialização 
 *      
 *      
 * GC
 * 	    Remove objetos da memória quando eles não são mais referenciados pelo programa
 * 
 * Atribuições Invalidas
 * Declarações
 * 
 * 
 *      
 * 
 * @author carlos
 *
 */

public class Exemplo4TiposDeDados {
	
	static int a; //iniciada com 0
	static double b;
	
	static Integer c; //null
	static Double d; //null
	
	public static void main(String[] args) {
		int e; //não iniciada
		Integer f; //null
		System.out.println(e); //Erro de compilação pois e não foi iniciada
	}
	
	public static void exemploGarbageCollection() {
		
		Object a = new Object();
		a = null; // objeto elegível para Garbage Collection
		
		Object b = new Object();
		Object c = b; // por essa linha não está elegível para o GC 
		
		b = null; //Objeto Original NÃO elegível para o Garbage Collection
		
	}
	
	public static void atribuicoesInvalidas() {
		byte a = 128; //inválido byte vai só até 127
		int i = 10;
		short s = i+128; //inválido. soma retorna inteiro (Errou pois somei 2 inteiros i como inteiro e 128 inteiro ambos não cabem em um short)
		
	}
	
	public static void declaracoes() {
		
		Boolean a = true; //true
		Boolean b = new Boolean("True"); //true
		Boolean c = new Boolean("TrUe"); //true  SEMPRE SERÁ TRUE SE EU PASSAR true escrevendo de qualquer jeito tenda a palavra inteira True true tRue trUe 
		Boolean d = new Boolean("T"); //false
		
		//Números Iniciados com 
		// 0  = Sistema Octal
		// 0x = Sistema Hexadecimal
		
		int e = 012;  //Começou com 0 octal, equivale a 10 em decimal
		int f = 0x2A; //hexadecimal equivale a 42
		float g = 0.15; //invalido pois 0.15 é double para ser float tinha que ter F
		float h = 0.15F;//O float pode ser f ou F
		double i = 0.15d; //Pode ser D ou d
		long j = 152l; // ou 152L
		double l = 0.15f; // válido
		byte m = 500; //Inválido byte até 127
		byte n = 127; //valido
		
		
		
		
		
		
	}
	
	
	

}
