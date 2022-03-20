package br.edu.ifpb.filipe.projetojpaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.filipe.projetojpaspring.DogDAO;
import br.edu.ifpb.filipe.projetojpaspring.model.entity.Dog;

@Controller
public class DogController {

	@Autowired
	private DogDAO dogDAO;
	
	public void create(String nome, int idade, float peso, String raca, float tamanho) {
		Dog dog = new Dog();
		dog.setNome(nome);
		dog.setIdade(idade);
		dog.setPeso(peso);
		dog.setRaca(raca);
		dog.setTamanho(tamanho);
		
		dogDAO.save(dog);
	}
	
	public List<Dog> list(){
		return (List<Dog>) dogDAO.findAll();
	}
}
