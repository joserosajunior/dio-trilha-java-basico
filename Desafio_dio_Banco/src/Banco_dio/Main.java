package Banco_dio;

public class Main {

	public static void main(String[] args) {
		Cliente jose = new Cliente();
		jose.setNome("José Rosa");
		
		Conta cc = new ContaCorrente(jose);
		cc.depositar(100);
		
		
		Conta poupanca = new ContaPoupanca(jose);
		
		cc.tranferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
