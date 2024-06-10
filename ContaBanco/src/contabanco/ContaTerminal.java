package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception  {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu Nome");
		String nome = scanner.next();
		
		System.out.println("Digite o Numero da Sua Conta");
		int numero = scanner.nextInt();
		
		System.out.println("Digite o Numero da Sua Agencia");
		String agencia = scanner.next();
		
		
		
		//System.out.println("Seu Saldo esta Disponivel para Saque é de 7000.00jo");//
		
		
				
		System.out.println("Ola, " + nome + " " );
		System.out.println("Sua conta é " + numero + " ");
		System.out.println("Sua Agencia é " + agencia + " ");
		System.out.println("Seu saldo é de  1000.00 e  já está disponivel para saque" );
		
		
		

	}

}
