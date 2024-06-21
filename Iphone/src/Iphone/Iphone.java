package Iphone;


public class Iphone implements AparelhoTelefonico, Navegador, RerodutoMusical {
	 public void ligar(){
		 System.out.println("LIGANDO");
	 }
	 
	 public void atender(){
		 System.out.println("ATENDENDO CHAMADA");
		 
	 }
	 
	 public void iniciarCorrioVoz() {
		 System.out.println("INICIANDO CORREIO DE VOZ");
	 }
	
	 public void exibirPagina() {
		 System.out.println("EXIBINDO PAGINA");
	 }
	 
	 public void adicionarNovaAba() {
		 System.out.println("ABRINDO NOVA ABA");
	 }
	 public void atualizarPagina() {
		 System.out.println("ATUALIZANDO PAGINA");
	 }
	 
	 public void tocar() {
		 System.out.println("REPRODUZINDO MUSICA");
	 }
	 
	 public void pausar() {
		 System.out.println("PAUSANDO MUSICA");		
	 }
	 
	 public void selecionarMusica() {
		 System.out.println("SELECIONANDO MUSICA");
	 }
	 
	 
}


