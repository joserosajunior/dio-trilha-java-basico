package controle_de_fluxo;

public class CaixaEletronico {

	public static void main(String[] args) throws Exception {
		double saldo = 12.0;
		double valorSolicitado = 17.0;
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Novo Saldo" + saldo);
		}else
		  System.out.println("Saldo Insuficiente");
		
		
	
				
	

	}

}
