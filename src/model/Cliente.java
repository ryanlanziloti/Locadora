package model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
	private Integer codFilme;
	private String nome;
	private String cpf;
	private String email;
	private Date dtNascimento;
	private ArrayList<Item> itens = new ArrayList<Item>();
}
