package Iphone.Funcinando;

import Iphone.AparelhoTelefonico;
import Iphone.Iphone;
import Iphone.Navegador;
import Iphone.RerodutoMusical;

public class IphoneFuncionando {
	public static void main(String[] args) {
		Iphone ip = new Iphone();
		Navegador navegador = ip;
		RerodutoMusical reprodutormusical = ip;
		AparelhoTelefonico aparelhotelefonico = ip;
		
		aparelhotelefonico.ligar();
		aparelhotelefonico.iniciarCorrioVoz();
		aparelhotelefonico.atender();
		
		
		navegador.exibirPagina();
		navegador.atualizarPagina();
		navegador.adicionarNovaAba();
		
		reprodutormusical.selecionarMusica();
		reprodutormusical.tocar();
		reprodutormusical.pausar();

	}
	
	
	
}
