package PilaresPOO;

public class Carro extends Veiculo{
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	
	private void confereCombustivel(){
		System.out.println("Conferinfo Combustivel");
		
	}
	private void confereCambio(){
		System.out.println("Conferinfo Cambio em P");
		
	}

}
