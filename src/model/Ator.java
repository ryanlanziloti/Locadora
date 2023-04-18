package model;

import java.util.ArrayList;

public class Ator {
	private Integer codFilme;
	private String nome;
	private String nacionalidade;
	private ArrayList<Filme> filmes = new ArrayList<Filme>();
	
	public Integer getCodFilme() {
		return codFilme;
	}
	public void setCodFilme(Integer codFilme) {
		this.codFilme = codFilme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public ArrayList<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(ArrayList<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public void cadastrarAtor(Ator ator) {
		  
	}
	
}
