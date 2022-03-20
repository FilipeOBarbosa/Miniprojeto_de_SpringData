package br.edu.ifpb.filipe.projetojpaspring;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.edu.ifpb.filipe.projetojpaspring.controller.DogController;
import br.edu.ifpb.filipe.projetojpaspring.model.entity.Dog;

@SpringBootApplication
public class ProjetoJpaSpringApplication implements  CommandLineRunner{

	@Autowired
	private DogController dogController;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoJpaSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		boolean sair = false;
		while(sair == false) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("1 - criar dog 2 - mostrar lista 0 - sair");
			int escolha = Integer.parseInt(leitor.nextLine());
			switch (escolha) {
			case 1:
				System.out.print("nome:");
				String nome = leitor.nextLine();
				
				System.out.print("idade:");
				int idade = Integer.parseInt(leitor.nextLine());
				
				System.out.print("peso:");
				float peso = Float.parseFloat(leitor.nextLine());
				
				System.out.print("raça:");
				String raca = leitor.nextLine();
				
				System.out.print("tamanho:");
				float tamanho = Float.parseFloat(leitor.nextLine());
				
				dogController.create(nome, idade, peso, raca, tamanho);
				break;

			case 2:
				List<Dog> dogs = dogController.list();
				for (Dog dog: dogs) {
					System.out.println(dog.toString());
				}
				break;

			case 3:
				sair = false;
				break;

			}
		}

	}
}