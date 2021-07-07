package ocajp8.um.javabasico;


/**
 * Underscore_
 * 	S� pode ser usado em n�meros
 *  Deve aparecer sempre entre n�meros(nunca entre ponto ou qualquer coisa)
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
 * Inicializa��o de Vari�veis
 *      Primitivos numericos a nivel de classe s�o iniciados com 0 por padr�o
 *      Objetos Wrapper nunca s�o iniciados
 *      Dentro de m�todos as vari�veis declaradas n�o possuem valor padr�o para inicializa��o 
 *      
 *      
 * GC
 * 	    Remove objetos da mem�ria quando eles n�o s�o mais referenciados pelo programa
 * 
 * Atribui��es Invalidas
 * Declara��es
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
		int e; //n�o iniciada
		Integer f; //null
		System.out.println(e); //Erro de compila��o pois e n�o foi iniciada
	}
	
	public static void exemploGarbageCollection() {
		
		Object a = new Object();
		a = null; // objeto eleg�vel para Garbage Collection
		
		Object b = new Object();
		Object c = b; // por essa linha n�o est� eleg�vel para o GC 
		
		b = null; //Objeto Original N�O eleg�vel para o Garbage Collection
		
	}
	
	public static void atribuicoesInvalidas() {
		byte a = 128; //inv�lido byte vai s� at� 127
		int i = 10;
		short s = i+128; //inv�lido. soma retorna inteiro (Errou pois somei 2 inteiros i como inteiro e 128 inteiro ambos n�o cabem em um short)
		
	}
	
	public static void declaracoes() {
		
		Boolean a = true; //true
		Boolean b = new Boolean("True"); //true
		Boolean c = new Boolean("TrUe"); //true  SEMPRE SER� TRUE SE EU PASSAR true escrevendo de qualquer jeito tenda a palavra inteira True true tRue trUe 
		Boolean d = new Boolean("T"); //false
		
		//N�meros Iniciados com 
		// 0  = Sistema Octal
		// 0x = Sistema Hexadecimal
		
		int e = 012;  //Come�ou com 0 octal, equivale a 10 em decimal
		int f = 0x2A; //hexadecimal equivale a 42
		float g = 0.15; //invalido pois 0.15 � double para ser float tinha que ter F
		float h = 0.15F;//O float pode ser f ou F
		double i = 0.15d; //Pode ser D ou d
		long j = 152l; // ou 152L
		double l = 0.15f; // v�lido
		byte m = 500; //Inv�lido byte at� 127
		byte n = 127; //valido
		
		
		
		
		
		
	}
	
	
	

}
