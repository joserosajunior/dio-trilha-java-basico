package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		

		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJunior = new Dev();
		devJunior.setNome("Junior");
		devJunior.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos:" + devJunior.getConteudosInscritos());
		
		devJunior.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos:" + devJunior.getConteudosInscritos());
		System.out.println("ConteudosConcluidos:" + devJunior.getConteudosConcluidos());
		System.out.println("XP:" + devJunior.calcularXp());
	
		System.out.println("--------");
		
		Dev devJose = new Dev();
		devJose.setNome("José");
		devJose.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devJose.getConteudosInscritos());
		devJose.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos:" + devJunior.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devJose.getConteudosConcluidos());
		System.out.println("XP:" + devJose.calcularXp());
		
	}

}
