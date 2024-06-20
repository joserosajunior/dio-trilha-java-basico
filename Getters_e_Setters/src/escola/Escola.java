package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe Junior");
		felipe.setIdade(15);
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " é do " + felipe.getSexo() + " tem " + felipe.getIdade() + " anos ");	
	}
}