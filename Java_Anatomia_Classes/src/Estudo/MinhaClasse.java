package Estudo;

public class MinhaClasse{
	
public static void main(String [] args ) {
	
	String primeiroNome = "José";
	String segundoNome =" Rosa";
	
	String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
	
	System.out.println(nomeCompleto);
}
	
public static String nomeCompleto(String primeiroNome, String segundonome) {
	return "Resultado do método " +  primeiroNome.concat("").concat(segundonome);
	
	
}

}