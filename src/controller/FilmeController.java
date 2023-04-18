package controller;

import model.Filme;

public class FilmeController {
	public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duracao) {
		if(titulo!=null&&titulo.length()>0&&genero!=null&&genero.length()>0&&
			sinopse!=null&&sinopse.length()>0&&duracao>0) {
			
			Filme filme = new Filme();   
			filme.cadastrarFilme(filme);
			return true;
			
		}else {
			return false;
		}
	}
	
}
