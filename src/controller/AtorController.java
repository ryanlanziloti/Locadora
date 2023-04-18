package controller;

import model.Ator;

public class AtorController {

	public boolean cadastrarAtor(String nome, String nacionalidade) {
		if(nome!=null && nome.length()> 0 && nacionalidade!=null && nacionalidade.length()>0) {
			Ator ator = new Ator();
			ator.cadastrarAtor(ator);
			return true;
			
		}else return false;
	}
	
}
