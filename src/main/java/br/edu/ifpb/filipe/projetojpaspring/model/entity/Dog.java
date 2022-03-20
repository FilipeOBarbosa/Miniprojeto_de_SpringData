package br.edu.ifpb.filipe.projetojpaspring.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String nome;
	private int idade;
	private String raca;
	private float tamanho;
	private float peso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Nome:"+nome+"\nIdade:"+idade+"\nRaça:"+raca+"\nTamanho:"+tamanho+"cm"+"\nPeso:"+peso+"\n";
		
	}
}
