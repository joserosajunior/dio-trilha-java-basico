package Banco_dio;

public interface ICconta {
	
	 void sacar(double valor);
	
	 void depositar(double valor);
	
	 void tranferir(double valor, Conta contaDestino); 
	 
	 void imprimirExtrato();

}
